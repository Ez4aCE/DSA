package Arrays;

public class MaxDifference {
    public static int maxDiff(int[] arr){
        int indexMax = -1;
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=1;i--){
            if(max<arr[i]){
                indexMax=i;
                max=arr[i];
            }
        }
        int min=arr[0];
        for(int i=0;i<indexMax;i++){
            min = Math.min(min,arr[i]);
        }
        
        return max-min;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
        System.out.println(maxDiff(arr));
    }
}
