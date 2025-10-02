import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k = sc.nextInt();
        int[] score = new int[len];
        int advance = 0;
        for(int i=0;i<len;i++){
            int num  =sc.nextInt();
            score[i]=num;
        }
        int kth = score[k-1];
        for(int i=0;i<len;i++){
            if(score[i]==0){
                break;
            }
            if(score[i]>=kth){
                advance++;
            }else{
                break;
            }
        }
        System.out.println(advance);
    }
}
