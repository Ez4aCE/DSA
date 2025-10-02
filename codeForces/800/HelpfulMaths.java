import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb  =new StringBuilder();
        int one =0;
        int two=0;
        int three=0;
        for(int i =0;i<str.length();i++){
            char currChar = str.charAt(i);
            if(currChar=='1'){
                one++;
            }else if(currChar=='2'){
                two++;
            }else if(currChar=='3'){
                three++;
            }
        }
        for(int i=1;i<=one;i++){
            sb.append('1');
            sb.append('+');
        }
        for(int i=1;i<=two;i++){
            sb.append('2');
            sb.append('+');
        }
        for(int i=1;i<=three;i++){
            sb.append('3');
            sb.append('+');
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
