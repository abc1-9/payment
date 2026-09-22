package com.fintech.payment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * System User Table
 * </p>
 *
 * @author Liping Wang
 * @since 2026-09-22
 */
@Getter
@Setter
@TableName("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * User ID / Primary Key
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * Username
     */
    private String username;

    /**
     * Encrypted Password
     */
    private String password;

    /**
     * User Email
     */
    private String email;

    /**
     * Account Status: ACTIVE, DISABLED
     */
    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
