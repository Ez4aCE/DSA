package codeForces.CP_31_800;

import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            min=Math.min(Math.abs(sc.nextInt()),min);
        }
        System.out.println(min);
    }
}
