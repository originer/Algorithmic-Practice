package com.shekhargulati.leetcode.algorithms.str;

import java.util.HashMap;

/**
 * 罗马数字转整数
 * Created by Horizon on 2018/9/20.
 */
public class Problem13 {
    /**
     * 暴力枚举法
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I') {
                if (i + 1 == chars.length || chars[i + 1] != 'V' && chars[i + 1] != 'X') {
                    num += 1;
                } else {
                    if (chars[i + 1] == 'V' && (i + 1) < chars.length) {
                        num += 4;
                        i++;
                        continue;
                    }
                    if (chars[i + 1] == 'X' && (i + 1) < chars.length) {
                        num += 9;
                        i++;
                        continue;

                    }
                }
            }
            if (chars[i] == 'V') {
                num += 5;
            }
            if (chars[i] == 'X') {
                if (i + 1 == chars.length || ((chars[i + 1] != 'L' && chars[i + 1] != 'C'))) {
                    num += 10;
                } else {
                    if (chars[i + 1] == 'L') {
                        num += 40;
                        i++;
                        continue;
                    }
                    if (chars[i + 1] == 'C') {
                        num += 90;
                        i++;
                        continue;
                    }
                }
            }
            if (chars[i] == 'L') {
                num += 50;
            }
            if (chars[i] == 'C') {
                if (i + 1 == chars.length || (chars[i + 1] != 'D' && chars[i + 1] != 'M')) {
                    num += 100;
                } else {
                    if (chars[i + 1] == 'D') {
                        num += 400;
                        i++;
                        continue;
                    }
                    if (chars[i + 1] == 'M') {
                        num += 900;
                        i++;
                        continue;
                    }
                }
            }
            if (chars[i] == 'D') {
                num += 500;
            }
            if (chars[i] == 'M') {
                num += 1000;
            }
        }
        return num;
    }

    /**
     * 从末尾开始遍历，如果右边的比左边大进行相加,右边比左边小相减
     * @param s
     * @return
     */
    public static int _romanToInt(String s) {
        if (s == null || s.length() == 0) return -1;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length(), result = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                result += map.get(s.charAt(i));
            else
                result -= map.get(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("M"));
        System.out.println(romanToInt("IVI"));
        System.out.println(_romanToInt("IVI"));
        System.out.println(_romanToInt("MCMXCIV"));
    }
}
