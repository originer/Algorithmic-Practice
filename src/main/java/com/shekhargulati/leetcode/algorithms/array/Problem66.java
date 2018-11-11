package com.shekhargulati.leetcode.algorithms.array;

import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * Created by Horizon on 2018/11/11.
 */
public class Problem66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0};

        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
