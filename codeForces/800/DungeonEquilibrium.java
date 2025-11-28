import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DungeonEquilibrium {
    public static int cal(int[] arr){
        int res=0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int k=e.getKey();
            int v=e.getValue();
            if(k>v){
                res+=v;
            }else if(k<v){
                res+=(v-k);
            }
        }

        return res;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(cal(arr));
        }
    }
}
