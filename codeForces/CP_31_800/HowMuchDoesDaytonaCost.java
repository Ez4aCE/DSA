package codeForces.CP_31_800;

import java.util.Scanner;
public class HowMuchDoesDaytonaCost{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int find=sc.nextInt();
            boolean found=false;
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                if(find==num){
                    found=true;
                }
            }
            System.out.println(found ? "YES":"NO");
        }
    }
}
