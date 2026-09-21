package com.fintech.payment.service.impl;

import com.fintech.payment.entity.Account;
import com.fintech.payment.mapper.AccountMapper;
import com.fintech.payment.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * User Account Balance Table
 * </p>
 *
 * @author Liping Wang
 * @since 2026-09-21
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
