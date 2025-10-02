import java.util.Scanner;

public class PetyaAndStrings {
    public static int compare(String s1, String s2){
        for(int i=0;i<s1.length();i++){
            char s1C = s1.charAt(i);
            char s2C = s2.charAt(i);
            int res = s1C- s2C;
            if(res==0){
                continue;
            }
            if(res<0){
                return -1;
            }else{
                return 1;
            }
        }

        return 0 ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(compare(s1.toLowerCase(), s2.toLowerCase()));
    }
}
