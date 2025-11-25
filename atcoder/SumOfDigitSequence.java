import java.util.Scanner;

public class SumOfDigitSequence {
    public static int convertDigit(int num){
        int res=0;
        while(num>0){
            int rem = num%10;
            res+=rem;
            num/=10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n+1];
        arr[0]=1;
        
        for(int i=1;i<n+1;i++){
            int sum= 0 ;
            for(int j=0;j<i;j++){
                int convert =convertDigit(arr[j]);
                sum+=convert;
            }
            arr[i]=sum;
        }
        System.out.println(arr[n]);
    }
}
