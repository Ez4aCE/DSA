package Searching;

public class SqareRoot {
    public static int sqareRoot(int num){
        int left=0;
        int right=num;
        while(left<=right){
            int  mid = left+ (right-left)/2;
            if(mid*mid==num)return mid;
            if(mid*mid<num){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return right;
    }
    public static void main(String[] args) {
        System.out.println(sqareRoot(2566));
    }
}
