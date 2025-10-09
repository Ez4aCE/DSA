package codeForces.CP_31_800;


import java.util.Arrays;
import java.util.Scanner;

public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int len=sc.nextInt();
            int[] arr= new int[len];
            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();
            }
            boolean swap=true;
            while(swap){
                swap=false;
                for(int i= 1;i<len-1;i++){
                    if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                        swap=true;
                    }
                }

            }
            boolean sorted = true;
            for(int i=1;i<len;i++){
                if(arr[i-1]>arr[i]){
                    sorted=false;
                    break;
                }
            }
            
            System.out.println(sorted ? "YES" : "NO");
        }
    }
}
