import java.util.Scanner;

public class AntonAndDanik{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        
        String str = sc.nextLine();
        int score = 0;
        for(int i=0;i<len;i++){
            char c = str.charAt(i);
            if(c=='D'){
                score++;
            }else{
                score--;
            }
        }
        if(score==0){
            System.out.println("Friendship");
        }else{
             System.out.println(score>0 ? "Danik" : "Anton");
        }
    }
}