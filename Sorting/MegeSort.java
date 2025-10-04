package Sorting;

import java.util.Arrays;

public class MegeSort {
    public static void merge(int[] arr, int start, int mid, int end){
        int[] arr1=new int[mid-start+1];
        int[] arr2=new int[end-mid];
        int index1=0;
        int index2=0;
        int x=start;
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i+start];
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[i+mid+1];
        }

        while(index1<arr1.length && index2<arr2.length){
            if(arr1[index1]<arr2[index2]){
                arr[x++]=arr1[index1++];
            }else{
                arr[x++]=arr2[index2++];
            }
        }

        while(index1<arr1.length){
            arr[x++]=arr1[index1++];
        }
        while(index2<arr2.length){
            arr[x++]=arr2[index2++];
        }


    }
    public static void divide(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int mid = start+((end-start)/2);
        divide(arr, start, mid);
        divide(arr,mid+1,end);
        merge(arr, start,mid,end);
    }
    public static void main(String[] args) {
        int[] arr = {5,3,8,-3,6,0,1};
        divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
