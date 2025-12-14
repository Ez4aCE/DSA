package codeForces.December_Contest;

import java.util.Scanner;

public class OperationswithInversions {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n =sc.nextInt();
            int max=0;
            int res=0;

            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                if(num<max)res++;
                max=Math.max(max,num);
            }

            System.out.println(res);
        }
    }
}
