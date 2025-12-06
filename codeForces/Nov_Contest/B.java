package codeForces.Nov_Contest;

import java.util.HashSet;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            HashSet<Integer> set = new HashSet<>();
            int n=sc.nextInt();
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                set.add(num);
            }
            System.out.println();
        }
    }
}
