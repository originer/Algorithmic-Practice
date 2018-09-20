package com.shekhargulati.leetcode.algorithms.str;

/**
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 * 如果不存在，则返回  -1
 * Created by Horizon on 2018/9/19.
 */
public class Problem28 {

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

    public static int _strStr(String haystack, String needle) {

        if (needle.isEmpty()) return 0;
        if (haystack.length() < needle.length()) return -1;
        int flag = 1;
        int p;
        for (int i = 0; i < haystack.length() - needle.length() + 1; ++i) {
            p = i;
            for (int j = 0; j < needle.length(); ++j) {
                if (haystack.charAt(p++) != needle.charAt(j)) {
                    flag = 0;
                    break;
                }
                flag = 1;
            }
            if (flag == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int re = _strStr("hello", "ll");
        System.out.println(re);
        assert re == 2;
    }
}
