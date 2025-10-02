import java.util.Scanner;
import java.util.Stack;

public class DownWithBrackets{
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        
        int t = sc.nextInt();
        
        sc.nextLine(); 
        for(int i=1;i<=t;i++){
            String str = sc.nextLine();
            
            if(str.length()==2){
                System.out.println("NO");
            }else{
                int open = 0;
                int groups = 0;
                for(int j=0;j<str.length();j++){
                    if(str.charAt(j)==')'){
                        open--;
                    }else{
                        open++;
                    }
                    if(open==0){
                        groups++;
                    }
                }
                if(groups>=2){
                    
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
                
            }
            
        }
    }
}