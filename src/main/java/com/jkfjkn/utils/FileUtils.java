package com.jkfjkn.utils;

import java.io.*;
import java.nio.file.*;

/**
 * 项目名: dispense
 * 文件名: FileUtils
 * 创建者: admin
 * 创建时间: 2026/5/19 16:08
 * 描述: 文件处理类
 **/
public class FileUtils {

    /**
     * 读取文件内容为字符串
     * @param filePath 文件路径
     * @return 文件内容，如果失败则返回 null
     */
    public static String readFileToString(String filePath) {
        try {
            return Files.readString(Path.of(filePath));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }
    }

    /**
     * 将字符串内容写入文件
     * @param filePath 文件路径
     * @param content  要写入的内容
     * @return true: 写入成功; false: 写入失败
     */
    public static boolean writeStringToFile(String filePath, String content) {
        try {
            Files.writeString(Path.of(filePath), content);
            return true;
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
            return false;
        }
    }

    /**
     * 复制文件
     * @param sourcePath 源文件路径
     * @param targetPath 目标文件路径
     * @return true: 复制成功; false: 复制失败
     */
    public static boolean copyFile(String sourcePath, String targetPath) {
        try {
            Files.copy(Path.of(sourcePath), Path.of(targetPath), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
            return false;
        }
    }
}
