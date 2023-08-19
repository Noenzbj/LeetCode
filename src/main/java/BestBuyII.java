public class BestBuyII {
  public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
    System.out.println(maxProfit(prices));
  }

  private static int maxProfit(int[] prices) {
    int profit=0;
    //int lowest = Integer.MAX_VALUE;

    for (int i = 0; i < prices.length; i++) {
      if ((i+1) < prices.length && prices[i] < prices[i+1]) {
        profit = profit + (prices[i+1] - prices[i]);
      }
    }


    return profit;
  }
}
