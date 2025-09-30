package Searching;

public class MedianOfTwoSortedArr {
    public static int median(int[] arr1, int[] arr2){
        int len1=arr1.length;
        int len2=arr2.length;
        int totalLength= len1+len2;
        int index1=0;
        int index2=0;
        int first =0;
        int second=0;
        while(index1+index2<totalLength/2+1){
            int num1 = index1<len1 ? arr1[index1] : Integer.MAX_VALUE;
            int num2 = index2<len2 ? arr2[index2]:Integer.MAX_VALUE;
            if(num1>=num2){
                first=second;
                second=num2;
                index2++;
            }else{
                first=second;
                second=num1;
                index1++;
            }
        }
        return totalLength%2==0 ? (first+second)/2 : second;
    }
    public static void main(String[] args) {
        int[] arr1={10,20,30};
        int[] arr2={5,15,25,35,45};
        System.out.println(median(arr1, arr2));
    }
}
