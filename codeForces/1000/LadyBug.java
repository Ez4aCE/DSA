import java.util.Scanner;

public class LadyBug{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests=  sc.nextInt();

        for(int i=1;i<=tests;i++){
            int len = sc.nextInt();
            sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            
            boolean odd = true;
            int oddStartS1 = 0;
            int oddStartS1Zero = 0;
            for(int j=0;j<s1.length();j++){
                if(odd){
                    oddStartS1++;
                    odd=false; 
                    if(s1.charAt(j)=='0') oddStartS1Zero++;
                }else{
                    odd=true;
                    if(s2.charAt(j)=='0') oddStartS1Zero++;
                }
                
            }
            int evenStartS1 = 0;
            int evenStartS1Zero = 0;
            odd=true;
            for(int j=0;j<s1.length();j++){
                if(odd){
                    
                    odd=false; 
                    if(s2.charAt(j)=='0') evenStartS1Zero++;
                }else{
                    odd=true;
                    if(s1.charAt(j)=='0') evenStartS1Zero++;
                    evenStartS1++;
                }
                
            }

            if(oddStartS1Zero>=oddStartS1 && evenStartS1Zero>=evenStartS1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
        }
    }
}