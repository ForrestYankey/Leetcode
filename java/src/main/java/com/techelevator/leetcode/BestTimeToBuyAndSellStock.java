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
        if (prices == null || prices.length <= 1) {
            return 0; // Not enough data to make a profit
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            int currentProfit = currentPrice - minPrice;

            // Update maxProfit if the current profit is greater
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            // Update minPrice if the current price is lower
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }
        }

        return maxProfit;
    }
