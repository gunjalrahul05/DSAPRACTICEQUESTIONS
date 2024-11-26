public class stockbuysell{
    public static void main(String[] args){
        int price[] = {7,1,5,3,6,4};

        int maxprofit=Integer.MIN_VALUE;

        int bp=price[0];
        for(int i=1;i<price.length;i++){
            bp=Math.min(bp,price[i]);
            int profit = price[i]-bp;
            maxprofit = Math.max(maxprofit,profit);
        }
        System.out.println("Max profit "+maxprofit );
    }
}