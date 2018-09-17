package com.shekhargulati.leetcode.algorithms;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * Created by Horizon on 2018/9/8.
 */
public class Problem53 {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int result = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && result == 0) {
                continue;
            }
            if (nums[i] > 0) {
                result += nums[i];
                if (max < result)
                    max = result;
            }
            if (nums[i] < 0) {
                if ((result + nums[i]) < 0) {
                    result = 0;
                }
            }
        }
        return max;
    }
}
