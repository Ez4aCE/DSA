package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        Integer[] arr1 = {15,20,5,10};
        Integer[] arr2={15,15,15,10};

        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2));
        System.out.println(set + " "+set.size());
    }
}
