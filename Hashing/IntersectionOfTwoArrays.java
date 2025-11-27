package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Integer[] arr1={10,15,20,25,30,50,15};
        Integer[] arr2={30,5,15,21,46};

        intersection(arr1,arr2);

        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr1));
        set.retainAll(Arrays.asList(arr2));
        System.out.println(set);
    }

    private static void intersection(Integer[] arr1, Integer[] arr2) {
        // TODO Auto-generated method stub
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr2));
        for(int n: arr1){
            if(set.contains(n)){
                System.out.println(n);
                set.remove(n);
            }
        }

    }
}
