public class ReverseWordsInAString {
    public static String reverseUsingArray(String str){
        String[] strArr = str.split(" ");
        int left=0;
        int right=strArr.length-1;

        while(left<right){
            String temp=strArr[left];
            strArr[left]=strArr[right];
            strArr[right]=temp;
            left++;
            right--;
        }
        return String.join(" ", strArr);
    }
    public static void main(String[] args) {
        System.out.println(reverseUsingArray("welcome to geeks for geeks"));
        System.out.println(reverseUsingArray("nope hope dope"));
        System.out.println(reverseUsingArray("nope hope"));
    }
}
