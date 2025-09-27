package Arrays;

public class MinimumGroupFlips {
    public static int flips(int[] arr){
        int flip1=0;
        int flip0=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i-1]==0){
                flip0++;
            }else{
                flip1++;
            }
        }
        if(arr[arr.length-1]==1){
            flip1++;
        }else{
            flip0++;
        }
        return Math.min(flip0,flip1);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,0,0,1};
        System.out.println(flips(arr));
    }
}
