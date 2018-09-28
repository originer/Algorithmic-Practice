package com.shekhargulati.leetcode.algorithms.dynamic;

/**
 * 买卖股票的最佳时机
 * Created by Horizon on 2018/9/25.
 */
public class Problem121 {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0 ;
        }
        int max = 0 ;
        int sofarMin = prices[0] ;
        for (int i = 0 ; i < prices.length ; ++i) {
            if (prices[i] > sofarMin) {
                max = Math.max(max, prices[i] - sofarMin) ;
            } else{
                sofarMin = prices[i];
            }
        }
        return  max ;
    }

    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
