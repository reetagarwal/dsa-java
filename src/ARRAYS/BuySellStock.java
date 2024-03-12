package ARRAYS;

public class BuySellStock {
    public static int stock(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{//this is for where we are facing loss
                buyPrice=prices[i];//so instead of selling we can buy the stock
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(stock(prices));
    }
}
