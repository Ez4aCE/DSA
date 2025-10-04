package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,78,2,32};
        insSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
