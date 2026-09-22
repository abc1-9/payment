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
 * Account Journal Statement Table
 * </p>
 *
 * @author Liping Wang
 * @since 2026-09-22
 */
@Getter
@Setter
@TableName("account_journal")
public class AccountJournal implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Primary Key ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * Associated Payment Order Number
     */
    private String orderNo;

    /**
     * User ID
     */
    private Long userId;

    /**
     * Transaction Type: DEBIT, CREDIT
     */
    private String type;

    /**
     * Transaction Amount
     */
    private BigDecimal amount;

    /**
     * Balance After Transaction
     */
    private BigDecimal balanceAfter;

    private LocalDateTime createdAt;
}
