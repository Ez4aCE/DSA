package Matrix;
import java.util.Arrays;
public class Transpose {

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

    public static void main(String[] args) {
        int[][] arr={
            {1,4,6},
            {3,5,7},
            {10,20,30}
        };
        matrixTranspose(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
