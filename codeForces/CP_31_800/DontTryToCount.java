package codeForces.CP_31_800;
import java.util.*;
public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++){
            int len1=sc.nextInt();
            int len2=sc.nextInt();
            sc.nextLine();
            String s1 = sc.next();
            String s2 =sc.next();
            StringBuilder sb1=new StringBuilder(s1);
            StringBuilder sb2=new StringBuilder(s2);
            int count=0;
            boolean found=false;
            for(int i=0;i<5;i++){
                if(sb1.toString().contains(sb2.toString())){
                    found=true;
                    break;
                }else{
                    sb1.append(sb1);
                    count++;
                }
            }
            System.out.println(found ? count : -1);
        }
    }
}
