package org.example.Easy;

import java.util.Arrays;

public class BuyChoko {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if (prices[0] + prices[1] <= money) {
            return money - (prices[0] + prices[1]);
        }
        return money;
    }
}
