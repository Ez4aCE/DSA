import java.util.Scanner;

public class Tournament{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            int max =0;
            for(int m=0;m<arr.length;m++){
                arr[m] = sc.nextInt();
                max = Math.max(max,arr[m]);
            }
            if(max==arr[j-1]){
                System.out.println("YES");
            }else if(k>1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}