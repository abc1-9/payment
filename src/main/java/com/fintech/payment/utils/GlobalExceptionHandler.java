package com.fintech.payment.utils;

import com.fintech.payment.model.response.BaseResponse;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
//TODO Save the log to a local file for easy analysis of problems in the future.

    /**
     * 1. Specifically, it captures the exception situations where the @Valid parameter validation fails.
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseResponse<String> handleValidationException(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        FieldError fieldError = bindingResult.getFieldError();
        String message = fieldError != null ? fieldError.getDefaultMessage() : "Parameter verification failed";
        return BaseResponse.fail(400, message);
    }

    /**
     * 2. Global fallback exception
     */
    @ExceptionHandler(Exception.class)
    public BaseResponse<String> handleException(Exception ex) {
        // print log
        ex.printStackTrace();

        // Return a unified 500 internal system error to the front end to avoid exposing specific stack information.
        return BaseResponse.fail(500, "The system has malfunctioned. Please try again later.");
    }
}