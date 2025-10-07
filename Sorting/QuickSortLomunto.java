package Sorting;

import java.util.Arrays;

public class QuickSortLomunto {
    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    public static int partition(int[] arr, int start, int end){
        int j=start-1;

        int pivot=arr[end];
        for(int i=start;i<end;i++){
            if(arr[i]<pivot){
                j++;
                swap(arr,j,i);
            }
        }
        j++;
        swap(arr,j,end);

        return j;
    }
    public static void qSL(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int divide = partition(arr, start, end);
        qSL(arr, start, divide-1);
        qSL(arr, divide+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {3,8,4,3,94,2,6,48,12};
        qSL(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
