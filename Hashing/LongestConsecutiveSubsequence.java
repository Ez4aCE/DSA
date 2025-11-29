import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static int findLongest(int[] arr){
        int maxLen=0;
        HashSet<Integer> set =new HashSet<>();

        for(int n: arr){
            set.add(n);
        }

        for(int n: set){
            if(set.contains(n-1)){
                continue;
            }
            int currLen=1;
            int next=n+1;
            while(set.contains(next)){
                currLen++;
                next++;
            }
            maxLen=Math.max(maxLen,currLen);
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr1={2, 6, 1, 9, 4, 5, 3};
        int[] arr2={1,1,1,2,2,3};
        System.out.println(findLongest(arr1));
        System.out.println(findLongest(arr2));
    }
}
