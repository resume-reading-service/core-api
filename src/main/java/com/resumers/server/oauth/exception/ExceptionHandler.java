package com.resumers.server.oauth.exception;

import com.component.MessageComponent;
import com.resumers.server.oauth.model.dto.ApiResponse;
import com.resumers.server.oauth.model.dto.EmptyObject;
import com.resumers.server.oauth.model.dto.ErrorResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * Created by sehajyang
 * DateTime : 2020/10/03
 */

@Slf4j
@RestController
@RestControllerAdvice
@RequiredArgsConstructor
public class ExceptionHandler implements ErrorController {

    private final ErrorAttributes errorAttributes;
    private final MessageComponent message;

    @Override
    public String getErrorPath() {
        return "/error";
    }

    private Map<String, Object> getErrorAttribute(WebRequest webRequest) {
        return errorAttributes.getErrorAttributes(webRequest, true);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = CustomException.class)
    public ResponseEntity<ApiResponse<EmptyObject>> customException(WebRequest webRequest, CustomException e) {
        return ResponseEntity.status(e.getType().getHttpStatusCode()).body(new ApiResponse<>(new ErrorResponse(e.getType().getCode(), getErrorAttribute(webRequest), e.getMessage())));
    }
}
