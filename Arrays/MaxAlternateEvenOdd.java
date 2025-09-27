package Arrays;

public class MaxAlternateEvenOdd {
    public static int maxAlt(int[] arr ){
        int res = 1;
        int count = 1;
        for(int i =1;i<arr.length;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                count++;
            }else{
                count=0;
            }
            res = Math.max(count,res);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,32,45,81,21};
        System.out.println(maxAlt(arr));
    }
}
