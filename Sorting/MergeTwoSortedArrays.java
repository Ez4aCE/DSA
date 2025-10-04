package Sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] merge (int[] arr1, int[] arr2){
        int[] res=new int[arr1.length+arr2.length];
        int index1=0;
        int index2=0;
        int x=0;
        while(index1<arr1.length && index2<arr2.length){
            if(arr1[index1]<arr2[index2]){
                res[x++]=arr1[index1++];
            }else{
                res[x++]=arr2[index2++];
            }
        }
        while(index1<arr1.length){
            res[x++]=arr1[index1++];
        }
        while(index2<arr2.length){
            res[x++]=arr2[index2++];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1={10,15,20};
        int[] arr2={3,5,12,12,14,25};
        int[] res=merge(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }
}
