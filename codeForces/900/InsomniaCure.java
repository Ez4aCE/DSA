import java.util.Arrays;
import java.util.Scanner;

public class InsomniaCure {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int[] attacks = new int[5];
        for(int i=0;i<5;i++){
            int n = sc.nextInt();
            attacks[i]=n;
        }
        int totalDragons = attacks[4];
        boolean[] damaged = new boolean[totalDragons+1];

        for(int i =0;i<4;i++){
            int fight = attacks[i];
            for(int j=fight;j<=totalDragons;j+=fight){
                

                damaged[j]=true;
            }
        }
        int totalDamaged = 0;

        for(boolean n : damaged){
            if(n){
                totalDamaged++;
            }
        }
        
        System.out.println(totalDamaged);

        
    }
}
