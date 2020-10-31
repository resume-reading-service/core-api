package com.resumers.server.oauth.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

/**
 * Created by sehajyang
 * DateTime : 2020/10/31
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {
    private Integer status;
    private String error;
    private String message;
    private LocalDateTime timeStamp;

    public ErrorResponse(Integer statusCode, Map<String, Object> errorAttribute, String message) {
        this.status = statusCode;
        this.message = message;
        this.error = (String) errorAttribute.get("error");
        this.timeStamp = new Timestamp(((Date) errorAttribute.get("timestamp")).getTime()).toLocalDateTime();
    }
}
