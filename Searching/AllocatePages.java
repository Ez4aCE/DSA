package Searching;

public class AllocatePages {
    public static boolean check(int[] arr, int mid, int k){
        int currSum=0;
        int counter=1;
        for(int i=0;i<arr.length;i++){
            if(currSum+arr[i]>mid ){
                counter++;
                currSum=0;
            }
            
            currSum+=arr[i];
            if(counter>k)return false;
            
            
        }
       
        
        return counter<=k;
    }
    public static int cal(int[] arr, int k ){
        int sum=0;
        int currPages=  0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            currPages=Math.max(currPages, arr[i]);
        }
        int res = Integer.MIN_VALUE;
        
        while(currPages<=sum){
            int mid = currPages+(sum-currPages)/2;
            
            
            if(!check(arr,mid,k)){
                currPages=mid+1;
                
                
            }else{
                sum=mid-1;
                res=mid;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(cal(arr,2));
    }
}
