package com.fintech.payment.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * code (0:success，others:errors)
     */
    private int code;


    private String message;


    private T data;

    /**
     * 响应时间戳
     */
    @Builder.Default
    private long timestamp = System.currentTimeMillis();

    public static <T> BaseResponse<T> success() {
        return BaseResponse.<T>builder()
                .code(0)
                .message("Success")
                .build();
    }

    public static <T> BaseResponse<T> success(T data) {
        return BaseResponse.<T>builder()
                .code(0)
                .message("Success")
                .data(data)
                .build();
    }

    public static <T> BaseResponse<T> fail(int code, String message) {
        return BaseResponse.<T>builder()
                .code(code)
                .message(message)
                .build();
    }
}