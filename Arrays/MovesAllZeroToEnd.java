package Arrays;

import java.util.Arrays;

public class MovesAllZeroToEnd {
    public static void move(int[] arr){
        int start = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)continue;
            arr[start]=arr[i];
            start++;
        }
        for(int i=start;i<arr.length;i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,4,0,5};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
}
