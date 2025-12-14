package codeForces.CP_31_900;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();

        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int largestWindow=1;
                int currWindow=1;
            for(int i=1;i<n;i++){
                if(arr[i]-arr[i-1]<=k){
                    currWindow++;
                }else{
                    currWindow=1;
                }
                largestWindow=Math.max(currWindow,largestWindow);
            }
            System.out.println(n-largestWindow);
        }
    }
}