package Searching;

public class ThreeSum {
    public static boolean ts(int[] arr, int target){
        int len = arr.length-1;
        for(int i=0;i<len-1;i++){
            int num1=arr[i];
            int left=i+1;
            int right=len;
            while(left<right){
                int sum = num1+arr[left]+arr[right];
                if(sum==target){
                    return true;
                }
                if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,8,9,20,40};
        System.out.println(ts(arr, 29));
    }
}
