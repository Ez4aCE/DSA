import java.util.Scanner;

public class VacationValidation{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int L = sc.nextInt();
        int R =sc.nextInt();

        sc.nextLine();

        String str = sc.nextLine();
        
        boolean valid = true;
        for(int i=L-1 ;i<R;i++){
            
            if(str.charAt(i)=='x'){
                valid=false;
                break;
            }
        }
        if(valid){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}