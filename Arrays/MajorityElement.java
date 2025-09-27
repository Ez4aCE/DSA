package Arrays;

public class MajorityElement {
    public static int mE(int[] arr){
        int res = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                res=arr[i];
               
            }
            if(arr[i]==res){
                count++;
            }else{
                count--;
            }
            
        }
        count = 0;
        for(int n :arr){
            if(n==res)count++;
        }
        return count>arr.length/2 ? res :-1;
    }
    public static void main(String[] args) {
        int[] arr= {9,7,4,8,8,8,8};
        System.out.println(mE(arr));
    }
}
