package com.shekhargulati.leetcode.algorithms;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转
 *  示例 1:
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * 输入: -123
 * 输出: -321
 *  示例 3:
 * 输入: 120
 * 输出: 21
 *
 * Created by Horizon on 2018/8/21.
 */
public class Problem07 {

    /**
     * 值得注意的是 120 -> 021
     * Integer.valueOf()的方法可以帮助去除前面的0
     * 使用 try catch 捕获翻转后超出int范围的值
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        try {
            if (x >= 0) {
                return Integer.valueOf(new StringBuilder(String.valueOf(x)).reverse().toString());
            } else {
                return -Integer.valueOf(new StringBuilder(String.valueOf(-x)).reverse().toString());
            }
        } catch (Exception e) {
            return 0;
        }
    }

/*    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }*/
}
