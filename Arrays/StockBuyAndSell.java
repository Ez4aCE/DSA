package Arrays;

public class StockBuyAndSell {
    public static int buySell(int[] arr){
        
        int res = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                res+= (arr[i]-arr[i-1]);
                
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,7,1,5,9};
        System.out.println(buySell(arr));
    }
}
