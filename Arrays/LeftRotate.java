package Arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void rotate(int[] arr, int m, int index){
        if(index==arr.length){
            return;
        }
        int element = arr[index];
        rotate(arr, m, index+1);
        arr[(arr.length+index-m)%arr.length] = element;
    }
    public static void revRotate(int[] arr,int m){
        m=m%arr.length;
        rev(arr,0, arr.length - 1);
        rev(arr,0, arr.length - m - 1);
        rev(arr, arr.length - m , arr.length - 1);
    }
    public static void  rev(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,2};
        revRotate(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
