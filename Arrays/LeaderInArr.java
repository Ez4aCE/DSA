package Arrays;

public class LeaderInArr {
    public static void leader(int[] arr ){
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
                System.out.println(max);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,45,6,12,5,8,2};
        leader(arr);
    }
}
