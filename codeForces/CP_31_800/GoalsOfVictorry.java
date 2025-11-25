package codeForces.CP_31_800;

import java.util.Scanner;

public class GoalsOfVictorry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int total=0;
            for(int i=0;i<n-1;i++){
                total+=sc.nextInt();
            }
            System.out.println(-total);
        }
    }
}
