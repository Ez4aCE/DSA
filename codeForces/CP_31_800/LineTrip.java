package codeForces.CP_31_800;

import java.util.*;
public class LineTrip{
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++){
            int len = sc.nextInt();
            int end = sc.nextInt();
            int res=Integer.MAX_VALUE;
            int[] arr= new int[len];
            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();
            }
            res= arr[0];
            for(int i=1;i<len;i++){
                res = Math.max(res,arr[i]-arr[i-1]);
            }
            res=Math.max(res,(end-arr[len-1])*2);
            System.out.println(res);
        }
    }
}