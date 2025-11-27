package Hashing;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountDistinctElement {

    public static int countDE(Integer[] arr){
        Set<Integer> set = new HashSet<>();

        for(int n: arr){
            set.add(n);
        }
        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set);
        System.out.println(countDE(arr));
    }
}
