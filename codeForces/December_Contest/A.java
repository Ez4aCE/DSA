package codeForces.December_Contest;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            int index=0;
            int sleep=0;
            int classRange=-1;
            while(index<n){
                char curr=str.charAt(index);
                if(curr=='0' && index>classRange){
                    sleep++;
                    
                }else if(curr=='1'){
                    classRange=index+k;
                }
                index++;
            }
            System.out.println(sleep);
        }
    }
}
