import java.util.Scanner;

public class SimpleRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();
        for(int i=0;i<tests;i++){
            int num = sc.nextInt();
            int times = sc.nextInt();
            if(num==1 ){
                if(times==2){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
                
            
            }else if(times>1){
                System.out.println("No");
            }else{
                boolean prime = true;
                for(int j=2;j<=Math.sqrt(num);j++){
                    if(num%j==0){
                        prime=false;
                        break;
                    }
                }
                System.out.println(prime ? "Yes" : "No");
            }
        }
    }
}
