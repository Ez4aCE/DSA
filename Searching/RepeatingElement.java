package Searching;

public class RepeatingElement {
    public static int repeat(int[] arr){
        int index=0;
        while(index<arr.length){
            if(arr[index]!=index){
                int index2=arr[index];
                if(arr[index]==arr[index2]){
                    return arr[index];
                }
                int temp=arr[index];
                arr[index]=arr[index2];
                arr[index2]=temp;
                
            }else{
                index++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {0,2,1,3,2,2};
        System.out.println(repeat(arr));
    }
}
