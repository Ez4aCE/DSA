import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            int sure = 0;
            for(int j=0;j<3;j++){
                int num = sc.nextInt();
                if(num==1){
                    sure++;
                }
            }
            count += sure>1? 1:0;
        }
        System.out.println(count);
    }
}
