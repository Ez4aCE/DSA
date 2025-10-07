import java.util.Scanner;

public class D1Akari {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String str = sc.nextLine();

        boolean hash = true;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='#'){
                sb.append('#');
                hash=true;
            }else if(hash){
                sb.append('o');
                hash=false;
            }else{
                sb.append('.');
            }
        }
        System.out.println(sb.toString());
sc.close();
    }
}
