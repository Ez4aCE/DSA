package Searching;
import java.util.*;
public class NextGreterElement {
    public static int[] nextGE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res =new int[arr.length];
        Arrays.fill(res,-1);
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(!st.isEmpty())res[i]=st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] ={1,8,43,6,9,46,3,1};
        int[] res=nextGE(arr);
        System.out.println(Arrays.toString(res));
    }
}
