package Arrays;

public class BuyandSellStock {
    public static int stockBuySell(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int sell = buy;
        int profit = 0;
        for(int i=1;i<n;i++){
            buy = Math.min(buy,prices[i]);
            sell = Math.max(prices[i],buy);
            profit = Math.max(profit , sell-buy);
        }
        return profit;
    }
    public static void main(String[] args) {
        int [] prices = {10, 7, 5, 8, 11, 9};
        System.out.println(stockBuySell(prices));
    }
}


