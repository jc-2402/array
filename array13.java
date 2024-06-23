//buying and selling stocks
public class array13{
    public static int buysellstocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;//to track lowest buying prices
        int maxprofit = 0;
        //to gey current sell price
        for(int i=0; i<prices.length; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice; //profit = selling - buying price .. current profit
                maxprofit = Math.max(maxprofit, profit); //update max profit to get max profit
            }
            else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("max profit is : "+buysellstocks(prices));
    }
}