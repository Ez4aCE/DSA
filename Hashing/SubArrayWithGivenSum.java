package Hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static boolean subArraySum(int[] arr, int target){
        HashSet<Integer>  set = new HashSet<>();
        int prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(prefix==target || set.contains(prefix-target))return true;
            
            set.add(prefix);
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,4,13,-3,-10,5};
        int[] arr2={-1,4,-3,5,1};
        int[] arr3={13,1,-2,7,6};
        int[] arr4={5,6,0,8};
        System.err.println(subArraySum(arr1,10));
        System.err.println(subArraySum(arr2,3));
        System.err.println(subArraySum(arr3,2));
        System.err.println(subArraySum(arr4,14));
    }
}
