package com.fintech.payment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * User Account Balance Table
 * </p>
 *
 * @author Liping Wang
 * @since 2026-09-21
 */
@Getter
@Setter
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Primary Key ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * User ID
     */
    private Long userId;

    /**
     * Available Balance
     */
    private BigDecimal balance;

    /**
     * Currency Code
     */
    private String currency;

    /**
     * Optimistic Lock Version Number
     */
    private Integer version;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
