import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=s2.length()-1;i>=0;i--){
            sb.append(s2.charAt(i));
        }
        String rev = sb.toString();
        
        System.out.println(rev.equals(s1)? "YES":"NO");
    }
}
