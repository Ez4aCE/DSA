package Arrays;

public class MaxSubArraySum {
    public static int kadane(int[] arr){
        int res=Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            res = Math.max(currSum,res);
            if(currSum<0)currSum=0;
            
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,8,7,1,2,3};
        System.out.println(kadane(arr));
    }
}
