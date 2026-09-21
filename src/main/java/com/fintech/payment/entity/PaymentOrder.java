package com.fintech.payment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Payment Order Table
 * </p>
 *
 * @author Liping Wang
 * @since 2026-09-21
 */
@Getter
@Setter
@TableName("payment_order")
public class PaymentOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Primary Key ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * Internal System Order Number
     */
    private String orderNo;

    /**
     * Idempotency Key passed from client
     */
    private String idempotencyKey;

    /**
     * Payer User ID
     */
    private Long userId;

    /**
     * Payment Amount
     */
    private BigDecimal amount;

    /**
     * Currency Code
     */
    private String currency;

    /**
     * Order Status: PENDING, SUCCESS, FAILED
     */
    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
