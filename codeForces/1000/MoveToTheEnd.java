import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class MoveToTheEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=1;i<=t;i++){
            int len = sc.nextInt();
            long[] arr = new long[len];
            long sum = 0;
            long[] suffixArr = new long[len];
            long firstMax=-1;
            PriorityQueue<long[]> pq = new PriorityQueue<>((a,b)->Long.compare(b[1], a[1]));
            for(int j=0;j<len;j++){
                long num = sc.nextInt();
                arr[j]=num;
                firstMax = Math.max(num,firstMax);
                
                
                if(j<len-1) pq.offer(new long[]{j,num});
            }
            for(int j=len-1;j>=0;j--){
                sum +=arr[j];
                suffixArr[j]=sum;
            }
            
            
            System.out.print(firstMax+" ");
            for(int j=len-2;j>=0;j--){
                
                if(!pq.isEmpty() && pq.peek()[0]>j){
                    while(!pq.isEmpty() && pq.peek()[0]>j){
                        pq.poll();
                    }
                }
                long lastElement = pq.peek()[1];
                System.out.print((lastElement+suffixArr[j+1])+" ");
                
            }
            System.out.println();
        }
    }
}
