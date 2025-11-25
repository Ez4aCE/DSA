package Matrix;

import java.util.Arrays;

public class RotateAntiClockWise {
    public static void matrixTranspose(int[][] arr){
        int startRow=0;
        int startCol=0;
        int rows=arr.length;
        int cols=arr.length;

        while(startRow<rows && startCol<cols){
            int currRow=startRow;
            int currCol=startCol;
            while(currRow<rows && currCol<cols){
                //swap
                int temp=arr[startRow][currCol];
                arr[startRow][currCol]=arr[currRow][startCol];
                arr[currRow][startCol]=temp;
                currRow++;
                currCol++;
            }
            startCol++;
            startRow++;
        }
    }
    public static void reverseMatrixByCol(int[][]arr){
        int n=arr.length;
        for(int c=0;c<n;c++){
            for(int r=0;r<n/2;r++){
                int temp=arr[r][c];
                arr[r][c]=arr[n-1-r][c];
                arr[n-1-r][c]=temp;
            }
        }
    }
    public static void rotateAntiClockWise(int[][] arr, int times){
        for(int i=1;i<=times;i++){
            matrixTranspose(arr);
            reverseMatrixByCol(arr);
        }
        
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        rotateAntiClockWise(arr, 3);
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
