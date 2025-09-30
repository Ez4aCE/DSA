package Searching;

public class BinarySearch {
    public static int recursiveBS(int[] arr , int left, int right, int target){
        int mid = left+(right-left)/2;
        if(left>right){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        return arr[mid]>target ?  recursiveBS(arr, left, mid-1, target) : recursiveBS(arr, mid+1, right, target);
    }
    public static int bs(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid= left+ (right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static int firstOccurence(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid= left+ (right-left)/2;
            if(arr[mid]==target && (mid==0 || arr[mid-1]!=target)){
                return mid;
            }
            if(target<=arr[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static int lastOccurence(int[]arr, int target){
        int left=0;
        int right=arr.length-1;
        int res=-1;
        while(left<=right){
            int mid= left + (right-left)/2;
            if(arr[mid]==target){
                res=mid;
                left=mid+1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return res;
    }
    public static int countOccurencers(int[]arr , int target){
        int first = firstOccurence(arr, target);
        int last= lastOccurence(arr, target);
        if(first==-1 || last==-1){
            return 0;
        }
        return last-first+1;
    }
    public static void main(String[] args) {
        int[] arr ={10,30,30,30,30,30,30,30,30,40,50};
        System.out.println(bs(arr , 40));
        System.out.println(recursiveBS(arr , 0, arr.length-1, 3));
        System.out.println(firstOccurence(arr , 30));
        System.err.println(lastOccurence(arr ,  30));
        System.out.println(countOccurencers(arr, 4));
    }
}
