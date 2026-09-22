package com.fintech.payment.controller;

import com.fintech.payment.model.request.RegisterRequest;
import com.fintech.payment.model.response.BaseResponse;
import com.fintech.payment.model.response.RegisterResponse;
import com.fintech.payment.service.ISysUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * System User Table
 * </p>
 *
 * @author Liping Wang
 * @since 2026-09-22
 */
@RestController
@RequestMapping("/api/v1/sysuser")
@RequiredArgsConstructor
public class SysUserController {

    private final ISysUserService sysUserService;

    @PostMapping("/register")
    public BaseResponse<RegisterResponse> register(@Valid @RequestBody RegisterRequest request) {
        RegisterResponse response = sysUserService.register(request);
        return BaseResponse.success(response);

    }
//    POST /api/v1/auth/login

//    POST /api/v1/auth/logout
}