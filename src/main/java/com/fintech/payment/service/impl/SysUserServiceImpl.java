package com.fintech.payment.service.impl;

import com.fintech.payment.model.request.RegisterRequest;
import com.fintech.payment.entity.Account;
import com.fintech.payment.entity.SysUser;
import com.fintech.payment.mapper.AccountMapper;
import com.fintech.payment.mapper.SysUserMapper;
import com.fintech.payment.model.response.RegisterResponse;
import com.fintech.payment.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * <p>
 * System User Table
 * </p>
 *
 * @author Liping Wang
 * @since 2026-09-22
 */
@Service
@RequiredArgsConstructor
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    private final AccountMapper accountMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public RegisterResponse register(RegisterRequest request) {
        // 1. Check if the user exists
        SysUser sysUser = this.lambdaQuery()
                .eq(SysUser::getUsername, request.getUsername())
                .one();

        if (sysUser != null) {
            throw new RuntimeException("Username already exists");
        }

        // 2. save user
        sysUser = new SysUser();
        sysUser.setUsername(request.getUsername());
        //TODO Encrypt the password and then store it in the database.
        sysUser.setPassword(request.getPassword());
        sysUser.setEmail(request.getEmail());
        this.save(sysUser);

        // 3. create account
        Account account = new Account();
        account.setUserId(sysUser.getId());
        account.setBalance(BigDecimal.ZERO); // The initial balance is set to 0.00.
        account.setCurrency(request.getCurrency());
        account.setVersion(0); // The optimistic lock version number is initialized to 0.

        // 4. save account to table
        accountMapper.insert(account);

        // 5. return RegisterResponse
        return RegisterResponse.builder()
                .userId(sysUser.getId())
                .username(sysUser.getUsername())
                .initialBalance(account.getBalance())
                .currency(account.getCurrency())
                .build();
    }

}
