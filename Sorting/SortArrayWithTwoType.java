package Sorting;

import java.util.Arrays;

public class SortArrayWithTwoType{
    public static void sortOddEven(int[] arr){
        int j  =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                j++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        } 
    }
    public static void sortNeg(int[] arr){
        int j  =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                j++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {15,-2,-3,18};
        sortNeg(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1={15,14,13,12};
        sortOddEven(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}