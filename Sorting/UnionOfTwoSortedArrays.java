package Sorting;
import java.util.*;
public class UnionOfTwoSortedArrays {
    public static List<Integer> union(int[] a, int[] b){
        List<Integer> res = new ArrayList<>();
        int index1=0;
        int index2=0;
        while(index1<a.length && index2<b.length){
            if(a[index1]==b[index2]){
                int num=a[index1];
                res.add(num);
                while(index1<a.length && a[index1]==num){
                    index1++;
                }
                while(index2<b.length && b[index2]==num){
                    index2++;
                }
            }else if(a[index1]<b[index2]){
                int num=a[index1];
                res.add(num);
                while(index1<a.length && a[index1]==num){
                    index1++;
                }
            }else{
                int num=b[index2];
                res.add(num);
                
                while(index2<b.length && b[index2]==num){
                    index2++;
                }
            }
        }
        while(index1<a.length){
            int num=a[index1];
                res.add(num);
                while(index1<a.length && a[index1]==num){
                    index1++;
                }
        }
        while(index2<b.length){
            int num=b[index2];
                res.add(num);
                
                while(index2<b.length && b[index2]==num){
                    index2++;
                }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1={3,5,10,10,10,15,15,20,20};
        int[] arr2={5,10,10,15,20,20,21};
        List<Integer> res=  union(arr1, arr2);
        System.out.println(res);
    }
}
