package best_time_to_buy_and_sell_stock;

public class Solution {

    public static void main(String[] args) {
        int [] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices){
            if (minPrice > price)
                minPrice = price;
            else if (price- minPrice > profit)
                profit = price - minPrice;
        }

        return profit;
    }

}
