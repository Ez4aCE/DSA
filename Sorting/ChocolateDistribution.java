 package Sorting;
import java.util.*;
public class ChocolateDistribution {

     public static void main(String[] args) {
        int[] arr = {7,13,2,4,9,6};
        Arrays.sort(arr);
        int left = 0;
        int res = Integer.MAX_VALUE;
        for(int i=2;i<arr.length;i++){
            res=Math.min(res,(arr[i]-arr[left++]));
        }
        System.out.println(res);
     }
}