import java.util.Scanner;

public class IwannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        boolean[] levels = new boolean[len+1];
        int x= sc.nextInt();
        for(int i=0;i<x;i++){
            int num = sc.nextInt();
            levels[num]=true;
        }
        int y = sc.nextInt();
        for(int i=0;i<y;i++){
            int num = sc.nextInt();
            levels[num]=true;
        }

        boolean tatakae=true;

        for(int i=1;i<len+1;i++){
            if(!levels[i]){
                tatakae=false;
                break;
            }
        }
        System.out.println(tatakae ? "I become the guy." : "Oh, my keyboard!");

    }
}
