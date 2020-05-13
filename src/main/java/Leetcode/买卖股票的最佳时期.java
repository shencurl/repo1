package Leetcode;

public class 买卖股票的最佳时期 {
    public int maxProfit(int[] prices) {
    /*    int max=0;
        for (int i=0;i<prices.length-1;i++){
            for (int j=i+1;j<prices.length;j++){
                max=Math.max(max,prices[j]-prices[i]);
            }
        }
        return max;*/
        //一次遍历，每次循环更新最低价格，并且记录最低价格
        int min_price = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_price) min_price = prices[i];
            else if (prices[i] - min_price > max) max = prices[i] - min_price;
        }
        return max;
    }
}
