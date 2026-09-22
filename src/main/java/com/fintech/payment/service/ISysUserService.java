package com.fintech.payment.service;

import com.fintech.payment.model.request.RegisterRequest;
import com.fintech.payment.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fintech.payment.model.response.RegisterResponse;

/**
 * <p>
 * System User Table
 * </p>
 *
 * @author Liping Wang
 * @since 2026-09-22
 */
public interface ISysUserService extends IService<SysUser> {
    RegisterResponse register(RegisterRequest request) ;
}
