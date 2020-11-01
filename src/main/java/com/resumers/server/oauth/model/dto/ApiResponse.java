package com.resumers.server.oauth.model.dto;

import lombok.Data;
import org.slf4j.MDC;
/**
 * Created by sehajyang
 * DateTime : 2020/10/31
 */

@Data
public class ApiResponse<T> {
    private MetaResponse meta;
    private T data;
    private ErrorResponse error;
    private String traceId;

    public ApiResponse() {
        this.meta = new MetaResponse();
        this.data = (T) EmptyObject.OBJECT;
        this.error = new ErrorResponse();
        setTraceId();
    }

    public ApiResponse(MetaResponse meta) {
        this.meta = meta;
        this.data = (T) EmptyObject.LIST;
        this.error = new ErrorResponse();
        setTraceId();
    }

    public ApiResponse(T data) {
        if (data == null) {
            this.data = (T) EmptyObject.OBJECT;
            this.meta = new MetaResponse();
        } else {
            this.data = data;
            this.meta = new MetaResponse(1L);
        }
        this.error = new ErrorResponse();
        setTraceId();
    }

    public ApiResponse(ErrorResponse error) {
        this.meta = new MetaResponse();
        this.data = (T) EmptyObject.OBJECT;
        this.error = error;
        setTraceId();
    }

    public ApiResponse(Long totalCount, T data) {
        this.meta = new MetaResponse(totalCount);

        if (data == null) {
            this.data = (T) EmptyObject.LIST;
        } else {
            this.data = data;
        }

        this.error = new ErrorResponse();
        setTraceId();
    }

    private void setTraceId() {
        try {
            this.traceId = MDC.get("TRACE_ID");
        } catch (NullPointerException e) {
            this.traceId = "";
        }
    }
}

