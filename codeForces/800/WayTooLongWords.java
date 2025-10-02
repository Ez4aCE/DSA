import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T  = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++){
            String str = sc.nextLine();
            int len = str.length();
            if(len>10){
                StringBuilder sb = new StringBuilder();
                sb.append(str.charAt(0));
                sb.append(String.valueOf(len-2));
                sb.append(str.charAt(len-1));
                System.out.println(sb.toString());
            }else{
                System.out.println(str);
            }
        }
    }
}
