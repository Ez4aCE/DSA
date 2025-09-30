package Arrays;

public class EquilibriumPoint {
    public static boolean ep(int[] arr){
        int len = arr.length;
        if(len==1)return true;
        int[] prefixArr=new int[len];
        int[] suffixArr = new int[len];
        int prefixSum=0;
        int suffixSum=0;
        for(int i=0;i<len;i++){
            prefixSum+=arr[i];
            suffixSum+=arr[len-1-i];
            prefixArr[i]=prefixSum;
            suffixArr[len-1-i]=suffixSum;
        }
        for(int i=0;i<len;i++){
            int left = prefixArr[i]-arr[i];
            int right = suffixArr[i]-arr[i];
            if(left==right)return true;
        }

        return false;
    }
    public static boolean epNoExtraSpace(int[] arr ){
        int totalSum = 0;
        for(int n:arr){
            totalSum+=n;
        }
        int prefixSum=0;
        for(int i=0;i<arr.length;i++){
            int right = totalSum-prefixSum-arr[i];
            if(right==prefixSum)return true;
            prefixSum+=arr[i];
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {4,-2,2};
        System.out.println(ep(arr));
        System.out.println(epNoExtraSpace(arr));
    }
}
