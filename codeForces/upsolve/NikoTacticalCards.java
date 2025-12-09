package codeForces.upsolve;

import java.util.Scanner;

public class NikoTacticalCards {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            long[] a=new long[n];
            long[] b=new long[n];

            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextLong();
            }
            long min=0;
            long max=0;

            for(int i=0;i<n;i++){
                long currMin=Math.min(min-a[i],b[i]-max);
                long currMax=Math.max(max-a[i] ,b[i]-min);
                min=currMin;
                max=currMax;
            }

            System.out.println(max);
        }
    }
}
