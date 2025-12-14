package codeForces.upsolve;

import java.util.Scanner;

public class OptimalShifts {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int zeros=0;
            int maxContiZeros=0;
            for(int i=0;i<n*2;i++){
                if(s.charAt(i%n)=='0'){
                    zeros++;
                }else{
                    zeros=0;
                }
                maxContiZeros=Math.max(maxContiZeros, zeros);
            }
            System.out.println(maxContiZeros);
        }
    }
}
