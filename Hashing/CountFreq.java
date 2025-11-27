package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFreq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        countFreq(arr);
    }

    private static void countFreq(int[] arr) {
        // TODO Auto-generated method stub
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            System.out.println("Key :"+e.getKey()+" "+"value : "+e.getValue());
        }
    }
}
