package Recursion;

public class SubsetSum{
    public static int countSubsets(int[] arr, int target,int index,int sum){
        
        if(index==arr.length){
            if(target==sum){
            return 1;
        }
            return 0;
        }
        int sum1  = countSubsets(arr,target,index+1,sum+arr[index]);
        int sum2 = countSubsets(arr,target,index+1,sum);
        return (sum1+sum2);
    }
    public static void main(String[] args){
      int[] arr = {19,7,-8,4,4};
      int sum = 11;
      System.out.println(countSubsets(arr, sum, 0, 0));  
    }
}