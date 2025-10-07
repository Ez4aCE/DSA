package Sorting;

import java.util.Arrays;

public class QuickSortHoare {
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        
        while(true){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
                
            }else{
                return end;
            }
        }
        
    }
    public static void qSH(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int divide = partition(arr, start,end);
        qSH(arr, start, divide);
        qSH(arr, divide+1, end);
    }

    public static void main(String[] args) {
         int[] arr = {5,3,8,4,3,94,2,6,48,12};
        qSH(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
