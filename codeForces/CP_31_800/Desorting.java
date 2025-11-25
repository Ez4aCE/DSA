package codeForces.CP_31_800;

import java.util.Scanner;


public class Desorting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int len=sc.nextInt();
            int[] arr= new int[len];
            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();
            }
            boolean sorted=true;
            int diff= Integer.MAX_VALUE;
            for(int i=1;i<len;i++){
                if(arr[i-1]>arr[i]){
                    sorted=false;
                }
                diff = Math.min(diff,arr[i]-arr[i-1]);
            }
            System.out.println(sorted==true ? diff/2+1:0);
        }
    }
}
