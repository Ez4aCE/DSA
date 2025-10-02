import java.util.Scanner;

public class WordCapitilization{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        char c = str.toUpperCase().charAt(0);
        sb.replace(0,1,String.valueOf(c));
        System.out.println(sb.toString());
    }
}