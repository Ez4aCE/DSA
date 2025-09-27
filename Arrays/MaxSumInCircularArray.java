package Arrays;

public class MaxSumInCircularArray {
    public static int maxSumCir(int[] arr){
        
        
        int maxNegSum = 0;
        int negSum = 0;
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            
            negSum+=arr[i];
            maxNegSum=Math.min(maxNegSum,negSum);
            if(negSum>0)negSum=0;
            currSum+=arr[i];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0)currSum=0;
        }
        if(maxSum<1)return maxSum;
        return Math.max(sum-maxNegSum,maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {100, -90, 80, -70, 60, -50};
        System.out.println(maxSumCir(arr));
    }
}
