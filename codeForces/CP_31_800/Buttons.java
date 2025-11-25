package codeForces.CP_31_800;

import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            a+= (c+1)/2;
            b+=c/2;
            if(a>b){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }
    }
}
