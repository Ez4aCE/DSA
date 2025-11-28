package codeForces.contest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int len=sc.nextInt();
            int[] arr= new int[len];
            for(int j=0;j<len;j++){
                arr[j]=sc.nextInt();
            }
            int[] prefixArr=new int[len];
            int prod=1;
            for(int j=0;j<len;j++){
                prod*=arr[j];
                prefixArr[j]=prod;
            }
            int k=-1;
            for(int j=0;j<len-1;j++){
                int left=prefixArr[j];
                
                int right=prefixArr[len-1]/left;
                if(left==right){
                    k=j+1;
                    break;
                }
            }
            System.out.println(k);
        }
    }
}