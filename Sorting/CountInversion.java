package Sorting;

public class CountInversion {
    public static int merge(int[] arr, int start, int mid, int end){
        int res=0;
        int index1=start;
        int index2=mid+1;
        int x=0;
        int[] mergedArr = new  int[end-start+1];
        while(index1<=mid && index2<=end){
            if(arr[index1]>arr[index2]){
                res+=(mid-index1+1);
                mergedArr[x++]=arr[index2++];
            }else{
                mergedArr[x++]=arr[index1++];
            }
        }
        while(index1<=mid){
            mergedArr[x++]=arr[index1++];
        }
        while(index2<=end){
            mergedArr[x++]=arr[index2++];
        }
        for(int i=0,j=start;i<mergedArr.length;i++,j++){
            arr[j]=mergedArr[i];
        }
        return res;
    }
    public static int countInv(int[] arr, int start, int end){
        if(start>=end){
            return 0;
        }
        int res=0;
        int mid = start+(end-start)/2;
         res += countInv(arr, start, mid);
         res += countInv(arr, mid+1, end);
        res+=merge(arr,start,mid,end);
        return res;

    }
    public static void main(String[] args) {
        int[] arr = {5,3,5,9,2,5,8,1};
        System.out.println(countInv(arr, 0, arr.length-1));
    }
}
