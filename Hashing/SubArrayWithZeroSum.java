package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static boolean subArraySum(int[] arr){
        HashSet<Integer>  set = new HashSet<>();
        int prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(prefix==0 || set.contains(prefix))return true;
            
            set.add(prefix);
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,4,13,-3,-10,5};
        int[] arr2={-1,4,-3,5,1};
        int[] arr3={3,1,-2,5,6};
        int[] arr4={5,6,0,8};
        System.err.println(subArraySum(arr1));
        System.err.println(subArraySum(arr2));
        System.err.println(subArraySum(arr3));
        System.err.println(subArraySum(arr4));
    }
}
