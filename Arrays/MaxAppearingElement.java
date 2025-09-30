package Arrays;

public class MaxAppearingElement {

    public static  int maxAppearInRange(int[] left , int[] right){

        int[] prefixArr = new int[101];
        for(int i=0;i<left.length;i++){
            prefixArr[left[i]]++;
            prefixArr[right[i]+1]--;
        }
        
        int maxCount = 0;
        int res=  0;
        int currCount=0;
        for(int i=0;i<101;i++){
            currCount+=prefixArr[i];
            if(currCount>maxCount){
                maxCount=currCount;
                res=i;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] left = {1,2,4};
        int[] right= {4,5,7};
        System.out.println(maxAppearInRange(left, right));
    }
}
