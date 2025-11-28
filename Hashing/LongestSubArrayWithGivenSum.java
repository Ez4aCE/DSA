package Hashing;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {
    public static int findLongest(int[] arr, int target){ 
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen=0;
        int prefix=0;
        

        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(prefix==target){
                maxLen=Math.max(maxLen,i+1);
            }
            
               if (map.containsKey(prefix - target)) {
                maxLen = Math.max(maxLen, i - map.get(prefix - target));
            }
                
            
            if(!map.containsKey(prefix))map.put(prefix, i);
            ;
        }
        
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr1={5,8,-4,-4,-4,4,2,-2};
        int[] arr2={3,1,0,1,8,2,3,6};
        int[] arr3={8,3,7};
        int[] arr4={8,3,1,5,-6,6,2,2};
        
        System.out.println(findLongest(arr1, 0));
        System.out.println(findLongest(arr2, 5));
        System.out.println(findLongest(arr3, 15));
        System.out.println(findLongest(arr4, 4));

    }
}
