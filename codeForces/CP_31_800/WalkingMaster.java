package codeForces.CP_31_800;

import java.util.Scanner;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Long t=sc.nextLong();
        for(Long i=0l;i<t;i++){
            Long x1=sc.nextLong();
            Long y1=sc.nextLong();
            Long x2=sc.nextLong();
            Long y2=sc.nextLong();
            Long diff=y2-y1;
            Long steps=diff;
            if(y2<y1){
                System.out.println(-1);
            }else if(x1+diff<x2){
                System.out.println(-1);
            }else{
                System.out.println(steps+x1-x2+diff);
            }
        }
    }
}
