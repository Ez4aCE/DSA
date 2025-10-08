package Sorting;

public class KthSmallestElement {
    

    public static int lom(int[] arr, int start, int end){
        int pivot = arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
                arr[i]=arr[end];
                arr[end]=temp;
        return i;
    }

    public static int sort(int[] arr, int start, int end, int k){
       if(start>end){
        return -1;
       }
        int pivot = lom(arr,start,end);
        if(pivot==k-1){
            
            return arr[pivot];
        }else if(pivot>k-1){
            return sort(arr, start, pivot-1, k);
        }else{
            return sort(arr, pivot+1, end, k);
        }
        
            
    }
    public static int quickSelect(int[] arr, int k){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int pivot = lom(arr, left, right);
            if(pivot==k-1){
                return arr[pivot];
            }else if(pivot<k-1){
                left=pivot+1;
            }else{
                right=pivot-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[]  arr= {10,5,25,8,5};
        System.out.println(sort(arr, 0, arr.length-1 , 5));
        System.out.println(quickSelect(arr , 5));
    }
}
