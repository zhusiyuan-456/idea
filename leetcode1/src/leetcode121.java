class solution{
    public int maxProfit(int[] prices) {
     int minprice=Integer.MAX_VALUE;
     int maxprofit=0;
     for (int i=0;i<prices.length;i++){
         if (prices[i]<minprice){
             minprice=prices[i];
         }
         else if (prices[i]-minprice>maxprofit)
             maxprofit=prices[i]-minprice;
     }
     return maxprofit;
    }

    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,10000};
        solution a=new solution();
        System.out.println(a.maxProfit(arr));
    }
}