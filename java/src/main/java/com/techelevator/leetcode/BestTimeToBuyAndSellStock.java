package com.techelevator.leetcode;

public class BestTimeToBuyAndSellStock {

    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     *
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     *
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     */

    public int maxProfit(int[] prices) {
        //margin
        int margin = 0;
        //loop through the array
        for (int i = 0; i < prices.length; i++){
            //grab the next element and compare it to the remaining elements
            int currentPrice = prices[i];
            for (int j = 1; i+j < prices.length; j++){
                if (prices[i+j] - prices[i] > margin){
                    margin = prices[i+j] - prices[i];
                }
            }
        }
        return margin;
    }
}
