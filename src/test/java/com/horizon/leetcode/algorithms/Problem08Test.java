package com.horizon.leetcode.algorithms;

import org.junit.Test;

/**
 * Created by Horizon on 2018/8/21.
 */
public class Problem08Test {

    @Test
    public void myAtoi() {
        //assert Problem08.myAtoi("-1123") == -1123;
        //System.out.println(Problem08.myAtoi("-1123"));
        //System.out.println(Problem08.myAtoi("   -123uyi"));
        //System.out.println(Problem08.myAtoi(" words and 987"));
        //System.out.println(Problem08.myAtoi("-91283472332"));
        //System.out.println(Problem08.myAtoi(""));
        System.out.println(Problem08.myAtoi("4193 with words"));
        System.out.println(Problem08.myAtoi("-"));
        System.out.println(Problem08.myAtoi("   -432"));
        System.out.println(Problem08.myAtoi(" 1"));
        System.out.println(Problem08.myAtoi("words and 987"));
        System.out.println(Problem08.myAtoi("  0000000000012345678"));
//        assert Problem08.myAtoi("123ui") == 123;
    }
}