package codeForces.contest;

import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            if(n%2==0){
                
                arr[0]=-1;
                arr[n-1]=2;
                for(int j=1;j<n-2;j+=2){
                    arr[j]=3;
                    arr[j+1]=-1;
                }
                
            }else{
                arr[0]=-1;
                
                for(int j=1;j<n-1;j+=2){
                    arr[j]=3;
                    arr[j+1]=-1;
                }
            }
            for(int j=0;j<n-1;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println(arr[n-1]);
        }
    }
}