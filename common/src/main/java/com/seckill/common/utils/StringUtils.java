package com.seckill.common.utils;

public class StringUtils {
    /**
     *
     * @param object
     * @return object to string 空返回""
     */
    public static String getString(Object object) {
        return object == null || "".equals(object) ? "" : object.toString();
    }

    /**
     *
     * @param object
     * @return 空为0
     */
    public static Integer getInteger(Object object) {
        return object == null || "".equals(object) ? 0 : Integer.parseInt(object.toString());
    }
}
