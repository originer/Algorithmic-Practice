package com.shekhargulati.leetcode.algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * Created by Horizon on 2018/9/20.
 */
public class Problem15 {

    /**
     * 取第一个数据为基石
     * 在取第二个数字相加，得到总和为0的条件target
     * 查询nums中是否包含target
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        //对数据进行排序，方便处理
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            //如果后面的一个数字跟前面一样就直接跳过，避免重复
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int l = i + 1, r = nums.length - 1;
                while (l < r) {
                    ArrayList<Integer> stepRes = new ArrayList<Integer>();
                    int sum = nums[i] + nums[l] + nums[r];
                    if (sum == 0) {
                        //判断是否存在的条件不能放在这里，否则会超时
                        //lists.contains()
                        lists.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) ++l;
                        while (l < r && nums[r] == nums[r - 1]) --r;
                        l++;
                        r--;
                    } else if (sum < 0) l++;
                    else r--;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        //int[] nums = {-1, 0, 1, 2, -1, -4};
        //int[] nums = {-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0};
        //int[] nums = {-2,0,1,1,2};
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(threeSum(nums));
    }
}
