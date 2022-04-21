package dsa;

public class BuySell {
    public static int getMaxProfit(int[] stockPrices) {
        if (stockPrices.length < 2)
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices.");

        int minPrice = stockPrices[0];
        int maxProfit = stockPrices[1] - stockPrices[0];


    }


}
