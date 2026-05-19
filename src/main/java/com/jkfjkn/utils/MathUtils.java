package com.jkfjkn.utils;

/**
 * 项目名: dispense
 * 文件名: MathUtils
 * 创建者: admin
 * 创建时间: 2026/5/19 16:08
 * 描述: 数字计算类
 **/
public class MathUtils {

    /**
     * 判断一个数是否为质数
     * @param number 待检查的数字
     * @return true: 是质数; false: 不是质数
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 计算最大公约数 (GCD)
     * @param a 第一个整数
     * @param b 第二个整数
     * @return 最大公约数
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    /**
     * 计算两个整数的和
     * @param a 第一个整数
     * @param b 第二个整数
     * @return 整数和
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
