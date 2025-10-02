import java.util.Scanner;

public class OneDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            int num  =sc.nextInt();
            int min = 9;
            while(num>0){
                int rem = num%10;
                min  =Math.min(rem,min);
                num /=10;
            }
            System.out.println(min);
        }
    }
}