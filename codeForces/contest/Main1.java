package codeForces.contest;

import java.util.Scanner;

public class Main1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            int len =sc.nextInt();
            int[] arrA = new int[len];
            int[] arrB = new int[len];
            for(int j=0;j<len;j++){
                arrA[j]=sc.nextInt();
            }
            for(int j=0;j<len;j++){
                arrB[j]=sc.nextInt();
            }
            
            int maxPosDiff = 0;
            for(int j=0;j<len;j++){
                if(arrA[j]>arrB[j]) maxPosDiff = Math.max(arrA[j]-arrB[j],maxPosDiff);
            }
            System.out.println(maxPosDiff+1);
        }
    }
}