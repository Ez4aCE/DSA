package codeForces.CP_31_800;

import java.util.Scanner;

public class OneandTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();

            int[] arr=new int[n];
            int twoCount=0;
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
                if(arr[j]==2)twoCount++;
            }
            if(twoCount%2!=0 ){
                System.out.println(-1);
            }else{
                if(twoCount==0 || (twoCount==2 && n==2)){
                    System.out.println(1);
                }else{
                    int startZero=0;
                    
                    for(int j=0;j<n;j++){
                        
                        if(arr[j]==2)startZero++;
                        if(startZero==twoCount-startZero){
                            System.out.println(j+1);
                            break;
                        }
                    }
                }
            }

        }
    }
}
