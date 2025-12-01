public class SubSequenceOfOtherString {
    public static boolean isValid(String s1, String s2){

        int index=0;

        for(int i=0;i<s1.length();i++){
            if(index< s2.length() && s1.charAt(i)==s2.charAt(index)){
                index++;
            }
        }


        return s2.length()==index;
    }
    public static void main(String[] args) {
        String s1="ABCDE";
        String s2="AED";
        System.err.println(isValid(s1, s2));
    }
}
