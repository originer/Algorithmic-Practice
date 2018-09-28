package com.shekhargulati.leetcode.algorithms.dynamic;

/**
 * 买卖股票的最佳时机 II
 * 允许多次交易
 * Created by Horizon on 2018/9/25.
 */
public class Problem122 {

    public static int maxProfit(int[] prices) {

        int max = 0;
        int size = prices.length;
        for (int i = 0; i < size - 1; ++i)
            if (prices[i] < prices[i + 1])
                max += prices[i + 1] - prices[i];
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
