package Matrix;

public class SearchMatrixRowandColWise {
    public static void binarySearch(int[][] arr, int target){
        int rows=arr.length;
        int cols=arr[0].length;

        int startRow=0;
        int startCol=cols-1;

        while(startRow<rows && startCol>=0){
            int curr=arr[startRow][startCol];
            if(curr==target){
                System.out.println("ROw : "+startRow+" "+"Col : "+startCol);
                return;
            }
            if(target<curr){
                startCol--;
            }else{
                startRow++;
            }
        }   
    }
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {19,29,39,49}
        };
        binarySearch(arr, 26);
    }
}
