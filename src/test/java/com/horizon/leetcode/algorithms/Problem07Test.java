package com.horizon.leetcode.algorithms;

import org.junit.Test;

/**
 * Created by Horizon on 2018/8/21.
 */
public class Problem07Test {
    @Test
    public void reverse() {
        Problem07 problem07 = new Problem07();
        int num = 123;
        System.out.println(problem07.reverse(num));
        int num1 = -123;
        System.out.println(problem07.reverse(num1));
        int num2 = 1534236469;
        System.out.println(problem07.reverse(num2));
    }

    public static void main(String[] args) {
        System.out.println(Integer.valueOf(String.valueOf(new StringBuilder("1534236469").reverse())));

        Integer in = new Integer(12);
        System.out.println(-in);
    }

}