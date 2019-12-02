package com.horizon.leetcode.algorithms;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class Problem14 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs==null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String common = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(common) != 0)
                //如果pre不是子串，就去掉pre末尾一位重新比较，直到是子串或者pre长度0时就会跳出本次循环去匹配下一轮外循环
                common = common.substring(0, common.length() - 1);
            i++;
        }
        return common;
    }
}
