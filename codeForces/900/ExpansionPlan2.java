import java.util.Scanner;

public class ExpansionPlan2 {
    public static boolean possible(String s , int x, int y){
        
        int[][] dirs = {{x,y},{y,x}};

        int right= s.length();
        int up=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='8'){
                up++;
            }
            
        }
       
        for(int[] dir :dirs){
            if(right>=dir[0] && up>=dir[1])return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            
            
            int x=sc.nextInt();
            int y=sc.nextInt();
            //sc.nextLine();
            String s= sc.next();
            possible(s, Math.abs(x), Math.abs(y));
            System.out.println(possible(s, Math.abs(x), Math.abs(y)) ? "YES":"NO");
        }
    }
}
