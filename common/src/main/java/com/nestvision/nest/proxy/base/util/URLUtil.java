package com.nestvision.nest.proxy.base.util;

import org.apache.commons.lang3.StringUtils;

public class URLUtil {

    private static final String SERAPTOR = "/";

    private static String concat(String left, String right) {

        String result = null;
        if (StringUtils.endsWith(left, SERAPTOR) && !StringUtils.startsWith(right, SERAPTOR)) {

            result = left + right;
        } else if (!StringUtils.endsWith(left, SERAPTOR) && StringUtils.startsWith(right, SERAPTOR)) {
            result = left + right;
        } else if (!StringUtils.endsWith(left, SERAPTOR) && !StringUtils.startsWith(right, SERAPTOR)) {
            result = left + SERAPTOR + right;
        } else {
            result = left + StringUtils.substring(right, 1);
        }

        return result;

    }

    public static String concat(String base, String... path) {

        String left = base;

        String result = "";

        for (String right : path) {

            result = concat(left, right);
            left = result;
        }
        return result;

    }

}
