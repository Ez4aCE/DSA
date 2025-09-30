package Arrays;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static ArrayList<Integer> findSum(int[] arr, int target){
        ArrayList<Integer> res = new ArrayList<>();
        int left =0;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            
            currSum+=arr[i];
            
            while(currSum>target && left<=i){
                currSum-=arr[left++];
            }
            if(currSum==target){
                res.add(left);
                res.add(i);
                
            }
            
        }
        return res;
    } 
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        System.out.println(findSum(arr,33));
    }
}
