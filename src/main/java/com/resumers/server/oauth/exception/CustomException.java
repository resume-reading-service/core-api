package com.resumers.server.oauth.exception;

import com.resumers.server.oauth.enums.ExceptionType;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by sehajyang
 * DateTime : 2020/10/31
 */

@Getter
@NoArgsConstructor
public class CustomException extends RuntimeException{
    private ExceptionType type;
    private String message;

    public CustomException(ExceptionType type) {
        super(type.getValue());
        this.type = type;
    }

    public CustomException(ExceptionType type, String message) {
        super(type.getValue());
        this.type = type;
        this.message = message;
    }
}
