package codeForces.CP_31_800;

import java.util.HashMap;
import java.util.Scanner;


import java.util.* ;
public class DoremysPaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            int len=sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<len;i++){
                int num=sc.nextInt();
                map.put(num,map.getOrDefault(num,0)+1);
            }
            
            if(map.size()==1){
                System.out.println("YES");
            }else if(map.size()==2){
                int diff = 0;
                for(int n : map.keySet()){
                    int val =map.get(n);
                    if(diff==0){
                        diff+=val;
                    }else{
                        diff-=val;
                    }
                }
                diff = Math.abs(diff);
                System.out.println(diff<2 ? "YES":"NO");
            }else{
                System.out.println("NO");
            }
            
        }
    }
}
