package Arrays;

public class MaximumSumOfKContinousElements {
    public static int maxSumk(int[] arr , int k){
        int maxSum=Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<k;i++){
            currSum+=arr[i];
        }
        maxSum =Math.max(maxSum,currSum);
        int index = 0;
        for(int i=k;i<arr.length;i++){
            currSum-=arr[index++];
            currSum+=arr[i];
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {5,-10,6,90,3};
        System.out.println(maxSumk(arr, 2));
    }
}
