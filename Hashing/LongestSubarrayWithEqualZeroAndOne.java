package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithEqualZeroAndOne {
    public static int findLongest(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen=0;
        int prefix=0;
        for(int i=0;i<arr.length;i++){
            
            //assume zero as -1
            if(arr[i]==0){
                prefix--;
            }else{
                prefix++;
            }
            if (prefix==0) {
                maxLen=Math.max(maxLen, i+1);
            }
            if(map.containsKey(prefix)){
                maxLen=Math.max(maxLen,i-map.get(prefix));
            }
            map.putIfAbsent(prefix,i);
            //System.out.println(prefix);
        }
        

        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr1={1,0,1,1,1,0,0};
        int[] arr2={1,1,1,1};
        int[] arr3={0,0,1,1,1,1,1,0};
        int[] arr4={0,0,1,1,1,0};
        System.out.println(findLongest(arr1));
        System.out.println(findLongest(arr2));
        System.out.println(findLongest(arr3));
        System.out.println(findLongest(arr4));
    }
}
