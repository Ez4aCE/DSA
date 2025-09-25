package Arrays;

import java.util.Arrays;

public class RemoveDublicatesFromSortedArr {
    public static int remDub(int[] arr){
        int res = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                arr[++res]=arr[i];
            }
        }
        return res+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,4,5,5};
        int newLen =remDub(arr);
        System.out.println(Arrays.toString(arr)+" "+newLen);
    }
}
