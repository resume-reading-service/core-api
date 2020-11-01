package com.component;

import lombok.RequiredArgsConstructor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by sehajyang
 * DateTime : 2020/10/31
 */

@Component
@RequiredArgsConstructor
public class MessageComponent {
    private final ResourceBundleMessageSource messageSource;

    public String getMessage(String code) {
        String message;
        try {
            message = messageSource.getMessage(code, null, LocaleContextHolder.getLocale());
        } catch (Exception e){
            message = "UNDEFINED ERROR";
        }
        return StringUtils.isEmpty(message) ? "UNDEFINED ERROR" : message;
    }
}
