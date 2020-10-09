package com.common;

import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;

/**
 * Created by sehajyang
 * DateTime : 2020/10/09
 */
public class Utils {
    public static boolean isValidId(Long id) {
        return isNotEmpty(id) && id != 0;
    }

    public static boolean isNotEmpty(Object object) {
        if (object instanceof Collection) {
            if (CollectionUtils.isEmpty((Collection<?>) object)) {
                return false;
            }
            return ((Collection<?>) object).size() != 1 || ((Collection<?>) object).iterator().next() != null;
        } else if (object instanceof String) {
            return !StringUtils.isEmpty(object);
        }
        return !ObjectUtils.isEmpty(object);
    }

    public static boolean isNotEmpty(int length, Object... objects) {
        if (objects == null) {
            return false;
        } else if (objects.length != length) {
            return false;
        }
        for (Object o : objects) {
            if (isEmpty(o)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Object object) {
        return !isNotEmpty(object);
    }

    public static boolean isEmpty(int length, Object... objects) {
        if (objects == null) {
            return true;
        } else if (objects.length != length) {
            return false;
        }
        for (Object o : objects) {
            if (isNotEmpty(o)) return false;
        }
        return true;
    }
}
