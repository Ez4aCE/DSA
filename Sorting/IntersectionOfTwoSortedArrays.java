package Sorting;

public class IntersectionOfTwoSortedArrays {
    public static void printCommon(int[] arr1, int[] arr2){
        int index1=0;
        int index2=0;
        while(index1<arr1.length && index2<arr2.length){
            if(arr1[index1]==arr2[index2]){
                int num=arr1[index1];
                System.out.print(num+" ");
                while(index1<arr1.length && arr1[index1]==num){
                    index1++;
                }
                while(index2<arr2.length && arr2[index2]==num){
                    index2++;
                }
            }else if(arr1[index1]<arr2[index2]){
                index1++;
            }else{
                index2++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1={3,5,10,10,10,15,15,20};
        int[] arr2={5,10,10,15,20,20};
        printCommon(arr1, arr2);
    }
}
