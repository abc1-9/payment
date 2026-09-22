package com.fintech.payment.model.response;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class RegisterResponse {
    private Long userId;
    private String username;
    private BigDecimal initialBalance;
    private String currency;
}