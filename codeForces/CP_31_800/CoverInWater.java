package codeForces.CP_31_800;


import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int j=1;j<=t;j++){
            int len=sc.nextInt();
            int countHash = 0;
            sc.nextLine();
            String str=sc.next();
            char[] arr = str.toCharArray();
            boolean found=false;
            for(int i=2;i<len;i++){
                if(arr[i]=='.' && arr[i-1]=='.' && arr[i-2]=='.'){
                    found=true;
                }
                if(arr[i]=='#')countHash++;
            }
            if(found){
                System.out.println(2);
            }else{
                if(arr[0]=='#')countHash++;
                if(len>1 && arr[1]=='#')countHash++;
                System.out.println(len-countHash);
            }
        }
    }
}
