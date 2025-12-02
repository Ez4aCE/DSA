import java.util.Arrays;

public class LeftMostRepeatingCharacter {
    public static int leftMostRepeat(String str){
        int res=str.length();

        int[] indexArr=new int[26];
        Arrays.fill(indexArr,-1);

        for(int i=0;i<str.length();i++){
            int index=str.charAt(i)-'a';
            if(indexArr[index]==-1){
                indexArr[index]=i;
            }else if(indexArr[index]!=-1){
                res= Math.min(res,indexArr[index]);
            }
        }

        return res==str.length() ? -1 : res;
    }
    public static void main(String[] args) {
        System.out.println(leftMostRepeat("abccb"));
        System.out.println(leftMostRepeat("geeksforgeeks"));
        System.out.println(leftMostRepeat("abcd"));
    }
}
