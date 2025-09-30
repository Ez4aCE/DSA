package Arrays;

public class QuerySumOfIndexRange {
    public static int querySumRange(int[] prefixArr, int start, int end){
        return prefixArr[end] - (start==0 ? 0 : prefixArr[start-1]);
    }
    public static void fillPrefix(int[]arr, int[] prefixArr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            prefixArr[i]=sum;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,8,3,9,6,5,4};
        int[] prefixArr = new int[arr.length];
        fillPrefix(arr, prefixArr);
        System.out.println(querySumRange(prefixArr, 0 , 6));
    }
}
