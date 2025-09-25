package Arrays;

public class SecondLargest {
    public static int sl(int[] arr){
        int index1=0;
        int index2=-1;

        for(int i=1;i<arr.length;i++){
            if(arr[index1]<arr[i]){
                index2=index1;
                index1=i;
            }else if(index2>=0 && arr[i]>arr[index2] && arr[index1]!=arr[index2]){
                index2=i;
            }else if(index2==-1 && arr[index1]!=arr[i]){
                index2=i;
            }
        }

        return index2;
    }
    public static void main(String[] args) {
        int[] arr = {10,10,9};
        System.out.println(sl(arr));
    }
}
