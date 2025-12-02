import java.util.Arrays;

public class LeftMostNonrepeatingChracter {
    public static int findNonRepeat(String str){
        int[] indexArr=new int[26];
        
        Arrays.fill(indexArr,-1);

        for(int i=0;i<str.length();i++){
            int index=str.charAt(i)-'a';
            if(indexArr[index]==-1){
                indexArr[index]=i;
            }else if(indexArr[index]>-1){
                indexArr[index]=-2;
            }
        }
        int res=str.length();
        for(int i=0;i<26;i++){
            if(indexArr[i]>=0){
                res=Math.min(res,indexArr[i]);
            }
        }
        return res==str.length() ? -1 : res;
    }
    public static void main(String[] args) {
        System.out.println(findNonRepeat("abce"));
        System.out.println(findNonRepeat("abceeab"));
        System.out.println(findNonRepeat("abcceeacb"));
    }
}
