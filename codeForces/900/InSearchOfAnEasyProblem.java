import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len = sc.nextInt();
        boolean easy = true;
        for(int i=0;i<len;i++){
            int num = sc.nextInt();
            if(num==1) easy=false;
        }
        System.out.println(easy ? "EASY":"HARD");
    }
}
