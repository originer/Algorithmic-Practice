package com.horizon.leetcode.algorithms.array;

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
        int result = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (result < 0) { //如果当前结果已经是负数，就不会有正面影响，直接抛弃
                result = nums[i];
            } else { //否则就把下一个数字添加过来，不管是正还是负
                result += nums[i];
            }
            if (result > max) { //取最大值
                max = result;
            }
        }
        return max;
    }
}
