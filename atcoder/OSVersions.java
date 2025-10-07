
import java.util.Scanner;

public class OSVersions {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        String one = sc.next();
        String two = sc.next();
        if(one.equals("Lynx")){
            System.out.println("Yes");
        }else if(one.equals("Serval") && !two.equals("Lynx")){
            System.out.println("Yes");
        }else if(one.equals(two)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
