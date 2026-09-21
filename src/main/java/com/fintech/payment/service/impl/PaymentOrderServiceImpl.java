package com.fintech.payment.service.impl;

import com.fintech.payment.entity.PaymentOrder;
import com.fintech.payment.mapper.PaymentOrderMapper;
import com.fintech.payment.service.IPaymentOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Payment Order Table
 * </p>
 *
 * @author Liping Wang
 * @since 2026-09-21
 */
@Service
public class PaymentOrderServiceImpl extends ServiceImpl<PaymentOrderMapper, PaymentOrder> implements IPaymentOrderService {

}
