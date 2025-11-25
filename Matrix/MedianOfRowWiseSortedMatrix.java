package Matrix;
import java.util.Arrays;
public class MedianOfRowWiseSortedMatrix {
    public static int findMedian(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;
        int min=arr[0][0];
        int max=arr[0][cols-1];
        int median=(rows*cols)/2;
        for(int i=1;i<rows;i++){
            min=Math.min(min,arr[i][0]);
            max=Math.max(max,arr[i][cols-1]);
        }
        while(min<max){
            int mid=(max+min)/2;
            int midPos = 0;

            for(int i=0;i<rows;i++){
                int pos=Arrays.binarySearch(arr[i], mid)+1;
                midPos+=Math.abs(pos);
            }
            
            if(midPos>median){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return max;

    }
    static int median(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        // initializing the minimum and maximum values
        int min = Integer.MAX_VALUE, 
            max = Integer.MIN_VALUE;

        // iterating through each row of the matrix
        for (int i = 0; i < n; i++) {
          
            // updating the minimum value if current 
            // element is smaller
            if (mat[i][0] < min) 
              	min = mat[i][0];

            // updating the maximum value if current 
            // element is larger
            if (mat[i][m - 1] > max) 
              	max = mat[i][m - 1];
        }

        // calculating the desired position of the median
        int desired = (n * m + 1) / 2;

        // using binary search to find the median value
        while (min < max) {
          
            // calculating the middle value
            int mid = min + (max - min) / 2;

            // counting the number of elements less than 
            // or equal to mid
            int place = 0;
            for (int i = 0; i < n; i++) {
                place += upperBound(mat[i], mid);
            }

            // updating the search range based on the count
            if (place < desired) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        // returning the median value
        return min;
    }

    // helper function to find the upper bound of a 
    // number in a row
    static int upperBound(int[] row, int num) {
        int low = 0, high = row.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (row[mid] <= num) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[][] arr={{ 1, 3, 5 ,12},
                        { 2, 6, 9,10 },
                        { 3, 6, 9,11 }};
        System.out.println(findMedian(arr));
        System.out.println(median(arr));
    }
}
