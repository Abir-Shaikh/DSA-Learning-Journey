public class Question121BestTimeToBuyAndSellStock {
    public static void main() {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max_profit = 0;
        int buy_prices = prices[0];
        for(int i = 0 ; i < n ; i++){
            int current_profit = prices[i] - buy_prices;
            if(current_profit > max_profit){
                max_profit = current_profit;
            }
            if(prices[i] <  buy_prices){
                buy_prices = prices[i];
            }
        }
        return max_profit;
    }
}
