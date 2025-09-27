package Arrays;

public class TrappingRainWater {
    public  static int trapWater(int[] arr ){
        int res = 0;
        int max = 0;
        int maxIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
        int currMax=0;
        for(int i=0;i<maxIndex;i++){
            currMax=Math.max(currMax, arr[i]);
            res+= currMax-arr[i];
        }
        currMax=0;
        for(int i=arr.length-1;i>maxIndex;i--){
            currMax=Math.max(arr[i],currMax);
            res+=currMax-arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1,2,5,2,4};
        System.out.println(trapWater(arr));
    }
}
