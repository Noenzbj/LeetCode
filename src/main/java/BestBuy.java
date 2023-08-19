public class BestBuy {
  public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
    System.out.println(maxProfit(prices));

  }
  public static int maxProfit(int[] prices){
//    int profit=0;
//    int pointer = 0;
//    int lowest = 0;
//    while (pointer < prices.length) {
//      if (prices[pointer] < prices[lowest] || pointer == 0) {
//        lowest = pointer;
//        for (int i = pointer + 1; i < prices.length; i++) {
//          if (prices[i] - prices[pointer] > profit) {
//            profit = prices[i] - prices[pointer];
//          }
//        }
//      }
//
//      pointer++;
//    }
//    return profit;


  int profit=0;
  int lowest = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < prices[lowest]) {
        lowest = i;
      }
      if (  prices[i]- prices[lowest]>= profit) {
        profit = prices[i]- prices[lowest];
      }
    }
  return profit;
  }
}
