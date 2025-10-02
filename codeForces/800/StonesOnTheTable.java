import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int left = 0;
        
        int remove = 0;
        while(left<len-1){
            char c = str.charAt(left);
            left++;
            while(left<len && c==str.charAt(left)){
                remove++;
                left++;
            }
        }
        System.out.println(remove);
    }
}
