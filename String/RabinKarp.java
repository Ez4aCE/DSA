import java.util.ArrayList;

public class RabinKarp {

    public static boolean check(String word, String pattern, int index){

        for(int i=0;i<pattern.length();i++){
            if(word.charAt(index)!=pattern.charAt(i)){
                return false;
            }
            index++;
        }

        return true;
    }


    public static ArrayList<Integer> searchString(String word, String pattern){
        ArrayList<Integer> res = new ArrayList<>();
        if(word.length()<pattern.length())return res;

        int mod=(int)Math.pow(10,9)+7;

        int patternHash = 0;
        int power=pattern.length()-1;

        for(int i=0;i<pattern.length();i++){
            int n=pattern.charAt(i)-'a'+1;
            patternHash+= ((int)Math.pow(5,power-i)*n)%mod;
        }

        int wordHash=0;
        for(int i=0;i<pattern.length();i++){
            int n=word.charAt(i)-'a'+1;
            wordHash+= ((int)Math.pow(5,power-i)*n)%mod;
        }

        if(wordHash==patternHash &&  check(word,pattern, 0))res.add(0);

        
        for(int i=pattern.length();i<word.length();i++){
            int n=word.charAt(i)-'a'+1;
            int prev=word.charAt(i-pattern.length())-'a'+1;
            wordHash = (5*(wordHash-(int)Math.pow(5,power)*prev)+n)%mod;
            if(wordHash==patternHash &&  check(word,pattern, i-pattern.length()+1))res.add(i-pattern.length()+1);
        }



        return res;
    }

    public static void main(String[] args) {
        String w="AAAAA";
        String p="AAA";
        ArrayList<Integer> distinctRes= searchString(w,p);
        System.out.println(distinctRes);
    }
}
