package com.jkfjkn.utils;

/**
 * 项目名: dispense
 * 文件名: StringUtils
 * 创建者: admin
 * 创建时间: 2026/5/19 16:08
 * 描述: 字符串处理类
 **/
public class StringUtils {

    /**
     * 判断字符串是否为 null 或空白（仅含空格、制表符等）
     * @param str 待检查的字符串
     * @return true: 为空或空白; false: 不为空
     */
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * 将字符串的首字母转换为大写
     * @param str 待转换的字符串
     * @return 首字母大写的字符串
     */
    public static String capitalize(String str) {
        if (isBlank(str)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /**
     * 使用指定分隔符拼接字符串数组
     * @param delimiter 分隔符
     * @param parts     字符串数组
     * @return 拼接后的字符串
     */
    public static String join(String delimiter, String... parts) {
        if (parts == null || parts.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            if (i > 0) {
                sb.append(delimiter);
            }
            sb.append(parts[i]);
        }
        return sb.toString();
    }
}
