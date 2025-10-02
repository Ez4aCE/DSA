import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = -1;
        int col = -1;
        for(int i=0;i<5;i++){
            for(int j = 0;j<5;j++){
                int num = sc.nextInt();
                
                if(num==1){
                    row=i+1;
                    col=j+1;
                }
            }
        }
        int distance = Math.abs(3-row) + Math.abs(3-col);
        System.out.println(distance);
    }
}
