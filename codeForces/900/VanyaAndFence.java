import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt(); 
        int h =sc.nextInt();
        int width = 0;
        for(int i=0;i<len;i++){
            int height = sc.nextInt();
            if(height>h){
                width +=2;
            }else{
                width++;
            }
        }
        System.out.println(width);
    }
}
