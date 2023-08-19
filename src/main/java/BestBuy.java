public class BestBuy {
  public static void main(String[] args) {
    int[] prices = {4,3,2,1};
    maxProfit(prices);
  }
  public static void maxProfit(int[] prices){
    int profit=0;
    int pointer = 0;
    while (pointer < prices.length) {
      for (int i = pointer + 1; i < prices.length; i++) {
        if (prices[i] - prices[pointer] > profit) {
          profit = prices[i] - prices[pointer];
        }
      }
      pointer++;
    }
    System.out.println(profit);
  }
}
