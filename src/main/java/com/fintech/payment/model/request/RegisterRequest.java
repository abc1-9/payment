package com.fintech.payment.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {

    // Required and the length should be between 6 and 18 characters.
    @NotBlank(message = "Username is required")
    @Size(min = 6, max = 18, message = "Username length must be between 6 and 18 characters")
    private String username;

    // Required and the length should be between 6 and 18 characters.
    @NotBlank(message = "Password is required")
    @Size(min = 6, max = 18, message = "Password length must be between 6 and 18 characters")
    private String password;

    // Verify email format
    @Email(message = "Invalid email format")
    private String email;

    // Default account currency (e.g. EUR)
    private String currency = "EUR";
}