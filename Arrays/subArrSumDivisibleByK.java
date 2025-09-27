package Arrays;

public class subArrSumDivisibleByK {
    public static int pairDivisibleByk(int[]arr, int k ){
        int res = 0;
        int[] rem = new int[k];
        for(int i=0;i<arr.length;i++){
            rem[arr[i]%k]++;
        }
        if(rem[0]>1){
            res += (rem[0]*(rem[0]-1))/2;
        }
        for(int i=1;i<(k+1)/2;i++){
            res +=(rem[i]*rem[k-i]);
        }
        if(k%2==0) res+= (rem[k/2]*(rem[k/2]-1))/2;
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,10,20};
        int k=5;
        System.out.println(pairDivisibleByk(arr,k));
    }
}
