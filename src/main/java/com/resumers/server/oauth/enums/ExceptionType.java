package com.resumers.server.oauth.enums;

import lombok.Getter;

/**
 * Created by sehajyang
 * DateTime : 2020/10/31
 */

@Getter
public enum ExceptionType {
    /*
     * BadRequest 400
     * Unauthorized 401
     * Forbidden 403
     * Not Found 404
     * Server 500
     */

    USER_NOT_FOUND(400, 1000, "존재하지 않는 유저입니다");

    private Integer httpStatusCode;
    private Integer code;
    private String value;

    ExceptionType(Integer httpStatusCode, Integer code, String value) {
        this.httpStatusCode = httpStatusCode;
        this.code = code;
        this.value = value;
    }
}
