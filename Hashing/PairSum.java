package Hashing;

import java.util.HashSet;

public class PairSum {
    public static boolean hasSum(int[] arr,int target){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(target-num))return true;
            set.add(num);
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {3,2,8,15,-8};
        int[] arr2={2,1,6,3};
        int[] arr3={5,8,-3,6};

        System.out.println(hasSum(arr1, 17));
        System.out.println(hasSum(arr2, 6));
        System.out.println(hasSum(arr3, 3));
    }
}
