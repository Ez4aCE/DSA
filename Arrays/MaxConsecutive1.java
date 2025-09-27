package Arrays;

public class MaxConsecutive1 {
    public static int maxCons(int[] arr){
        int res = 0;

        int count=0;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                count=0;
            }
            res = Math.max(res,count);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,1,1,1,1,0,0,1};
        System.out.println(maxCons(arr));
    }
}
