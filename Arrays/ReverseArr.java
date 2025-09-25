package Arrays;

import java.util.Arrays;

public class ReverseArr {
    public static void rev(int[] arr, int index){
        if(index==arr.length){
            return;
        }
        int element = arr[index];
        rev(arr,index+1);
        arr[arr.length-index-1]=element;
    }
    public static void revIt(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,9,5};
        revIt(arr);
        System.out.println(Arrays.toString(arr));
    }
}
