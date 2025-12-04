package Hashing;

import java.util.HashMap;

public class LongestCommonSpanOfSumInTwoArrays{
    
    public static int findLongest(int[] arr1, int[] arr2){
        int maxLen=0;
        int[] temp=new int[arr1.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr1[i]-arr2[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix=0;

        for(int i=0;i<temp.length;i++){
            prefix+=temp[i];
            if(prefix==0){
                maxLen=Math.max(maxLen,i+1);
            }
            if(map.containsKey(prefix)){
                maxLen=Math.max(maxLen,i+map.get(prefix));
            }
            map.putIfAbsent(prefix,i);
        }   
            
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr1={2,1,3,10,100,100};
        int[] arr2={31,2,1,11,0,1};
        System.out.println(findLongest(arr1, arr2));
    }
}