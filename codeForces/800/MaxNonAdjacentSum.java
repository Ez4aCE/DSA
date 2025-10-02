public class MaxNonAdjacentSum {
    public static int maxSum(int[] arr, int index,int sum){
        if(index>=arr.length){
            return sum;
        }
        int res = Math.max(maxSum(arr, index+2, sum+arr[index]),maxSum(arr, index+3, sum+arr[index]));
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {75,101,120,75,65,135,130} ;
        System.out.println(maxSum(arr, 0, 0));
    }
}
