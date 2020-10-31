package com.component;

import com.common.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

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
        return Utils.isEmpty(message) ? "UNDEFINED ERROR" : message;
    }
}
