import java.util.*;
public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String res= s.substring(0,s.length()/2) + s.substring(s.length()/2+1);
        System.out.println(res);
        
    }
}
