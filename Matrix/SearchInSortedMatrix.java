package Matrix;

public class SearchInSortedMatrix {
    public static void BinarySearch(int[][] arr, int target){
        int rows=arr.length;
        int cols=arr[0].length;
        int left=0;
        int right=rows*cols-1;
        while (left<=right) {
            int mid = left+(right-left)/2;
            int midRow=mid/cols;
            int midCol=mid%cols;
            if(arr[midRow][midCol]==target){
                System.out.println("row :"+midRow+" "+"col :"+midCol);
                return;
            }
            if(arr[midRow][midCol]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        BinarySearch(arr, 4);
    }
    
}