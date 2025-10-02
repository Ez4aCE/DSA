import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean[] unique = new boolean[26];
        for(int i=0;i<str.length();i++){
            int index  = str.charAt(i)-'a';
            unique[index]=true;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(unique[i]){
                count++;
            }
        }
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
