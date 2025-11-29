package codeForces.Nov_Contest;


import java.util.Scanner;

public class MaximumNeighborhood {
    public static int cal(int n) {
        int max=0;
        int[][] store=new int[n][n];
        int start=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                store[i][j]=start;
                start++;
            }
        }
       
        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int curr= store[i][j];
                for(int[] dir:dirs){
                    int r=dir[0];
                    int c=dir[1];
                    if(i+r>=0 && i+r<n && j+c>=0 && j+c<n){
                        curr+=store[i+r][j+c];
                    }
                }
                max=Math.max(max,curr);
            }
        }
        

        return max;
    }
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        int t=sc.nextInt();
        for(int i =0;i<t;i++){
            int n=sc.nextInt();
            if(n==1){
                System.out.println(1);
                
            } else if(n==2){
                System.out.println(9);
            }else{
                int maxVal=cal(n);
                System.out.println(maxVal);
            }
            
        }
    }
}
