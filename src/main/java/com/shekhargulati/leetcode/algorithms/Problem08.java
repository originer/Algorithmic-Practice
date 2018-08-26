package com.shekhargulati.leetcode.algorithms;

/**
 * 实现 atoi，将字符串转为整数。
 * <p>
 * 在找到第一个非空字符之前，需要移除掉字符串中的空格字符。如果第一个非空字符是正号或负号，选取该符号，并将其与后面尽可能多的连续的数字组合起来，这部分字符即为整数的值。如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * <p>
 * 字符串可以在形成整数的字符后面包括多余的字符，这些字符可以被忽略，它们对于函数没有影响。
 * <p>
 * 当字符串中的第一个非空字符序列不是个有效的整数；或字符串为空；或字符串仅包含空白字符时，则不进行转换。
 * <p>
 * 若函数不能执行有效的转换，返回 0。
 * <p>
 * Created by Horizon on 2018/8/21.
 */
public class Problem08 {

    public int myAtoi(String str) {
        if(str.isEmpty())
            return 0;
        int flag =1,i=0;
        long result = 0;
        //判断空字符的个数，并且确定空字符结束的位置
        while(i < str.length() && str.charAt(i) == ' ')
            i++;
        //如果统计的空字符个数与字符串长度相同，则判断为这个空字符，不能转换
        if(i == str.length())
            return 0;
        //由于上面是i++，所以此时i为空字符之后的第一个非空字符的索引值，此位置判断为
        //flag为正还是负的位置，并分别赋值
        if (str.charAt(i) == '+' || str.charAt(i) == '-'){
            flag = str.charAt(i)=='+'? 1 : -1;
            i++;
        }
        //过去这符号位之后，应该是判断是否是数字字符，如果不是则不会执行下面的for循环，
        //并且下一位不是数字则其不会再进行while循环
        while(i < str.length() && str.charAt(i) >= '0'&& str.charAt(i)<='9'){
            result = 10 * result + (str.charAt(i++) -'0');
            //判断是否发生了溢出，超出了所给的位置
            if(result > Integer.MAX_VALUE){
                return flag==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
        }
        return Integer.parseInt(String.valueOf(result * flag));
    }

    //public static int myAtoi(String str) {
    //    str = str.trim();
    //    if (str.isEmpty()) {
    //        return 0;
    //    }
    //    char[] strl = str.toCharArray();
    //    char[] result = new char[strl.length];
    //    boolean flag = true;
    //    if (strl[0] == '-' || strl[0]=='+') {
    //        if (strl.length<2) return 0;
    //        if (strl[0]=='-')
    //            flag = false;
    //        strl[0] = ' ';
    //    } else if (!(strl[0] > '0' && strl[0] < '9')) {
    //        return 0;
    //    }
    //
    //    for (int i = 0; i < strl.length; i++) {
    //        if (check(strl[i])) {
    //            result[i] = strl[i];
    //        } else {
    //            break;
    //        }
    //    }
    //    try {
    //        if (flag)
    //            return Integer.valueOf(new String(result).trim());
    //        else
    //            return -Integer.valueOf(new String(result).trim());
    //    } catch (NumberFormatException e) {
    //        return flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
    //    }
    //}
    //
    ///**
    // * 检查字符是否是数字
    // *
    // * @param c
    // * @return
    // */
    //public static boolean check(char c) {
    //    if ((c >= '0' && c <= '9') || (c == ' ')) {
    //        return true;
    //    }
    //    return false;
    //}
}
