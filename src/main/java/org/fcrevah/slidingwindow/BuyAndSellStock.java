package org.fcrevah.slidingwindow;

public class BuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = prices[1];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++){
            sell = prices[i];
            if (sell - buy > maxProfit) {
                maxProfit = sell - buy;
            } else if (buy > sell)
                buy = sell;
        }

        return maxProfit;
    }
}
