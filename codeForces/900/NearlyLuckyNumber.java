import java.util.Scanner;

public class NearlyLuckyNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long luckyCount = 0;
        while (num > 0) {
            long digit = num % 10;
            if (digit == 4 || digit == 7) luckyCount++;
            num /= 10;
        }
        boolean lucky = luckyCount>0 ? true:false;
       
        while(luckyCount>0){
            long rem = luckyCount%10;
            if(rem!=4 && rem!=7){
                lucky=false;
                break;
            }
            luckyCount/=10;
        }
        if(lucky){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}