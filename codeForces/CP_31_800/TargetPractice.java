package codeForces.CP_31_800;

import java.util.Scanner;



public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int j=0;j<t;j++){
            char[][] board =new char[10][10];
            
            for(int i=0;i<10;i++){
                String s=sc.next();
                for(int k=0;k<10;k++){
                    board[i][k]=s.charAt(k);
                }
            }
            int totalScore =0;
            int currPoint=1;
            int sr=0;
            int scl=0;
            int er=10;
            int ecl=10;
            while(sr<er && scl<ecl){
                //right
                if(sr<er && scl<ecl){
                    for(int i=scl;i<ecl;i++){
                        if(board[sr][i]=='X'){
                            totalScore+=currPoint;
                        }
                    }
                    sr++;
                }
                //down
                if(sr<er && scl<ecl){
                    for(int i=sr;i<er;i++){
                        if(board[i][ecl-1]=='X'){
                            totalScore+=currPoint;
                        }
                    }
                    ecl--;
                }
                if(sr<er && scl<ecl){
                    for(int i=ecl-1;i>=scl;i--){
                        if(board[er-1][i]=='X'){
                            totalScore+=currPoint;
                        }
                    }
                    er--;
                }
                if(sr<er && scl<ecl){
                    for(int i=er-1;i>=sr;i--){
                        if(board[i][scl]=='X'){
                            totalScore+=currPoint;
                        }
                    }
                    scl++;
                }
                currPoint++;
            }
            System.out.println(totalScore);
        }
    }
}
