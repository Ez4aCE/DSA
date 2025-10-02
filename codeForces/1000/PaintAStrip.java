import java.util.Scanner;

public class PaintAStrip{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i  =1;i<=t;i++){
            int  len = sc.nextInt();

            if(len==1){
                System.out.println(1);
            }else{
                int steps = 1;
                

                int maxRange = 1;
                while(maxRange<len){
                    maxRange = 2*(maxRange+1);
                    steps++;
                    
                }
                System.out.println(steps);
            }
        }
    }
}