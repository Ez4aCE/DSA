package Searching;

public class TwoSum {
    public static boolean search(int[] arr, int target){
            int left=0;
            int right=arr.length-1;
            while(left<right){
                int sum=  arr[left]+arr[right];
                if(sum==target)return true;
                if(target>sum){
                    left++;
                }else{
                    right--;
                }
            }
        return false;
    }
    public static void main(String[] args) {
        int[] arr ={2,5,8,12,30};
        System.out.println(search(arr,21));
    }
}
