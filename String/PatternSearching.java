import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PatternSearching {

    public static boolean check(String word, String pattern, int index){

        if(word.length()-index<pattern.length())return false;

        for(int i=0;i<pattern.length();i++){
            if(word.charAt(index)!=pattern.charAt(i)) return false;
            index++;
        }


        return true;
    }

    public static ArrayList<Integer> findLoc(String word, String pattern){
        ArrayList<Integer> res= new ArrayList<>();

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==pattern.charAt(0)){
                
                if (check(word, pattern, i))res.add(i);
            }
        }

        return res;
    }

    public static ArrayList<Integer> searchDistinct(String word, String pattern){
        Map<Character, Integer> wordSet = new HashMap<>();
        Map<Character, Integer> patternSet = new HashMap<>();

        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<pattern.length();i++){
            patternSet.put(pattern.charAt(i),patternSet.getOrDefault(pattern.charAt(i),0)+1);
            wordSet.put(word.charAt(i),wordSet.getOrDefault(word.charAt(i),0)+1);
        }

        if(wordSet.equals(patternSet) && check(word, pattern, 0))res.add(0);
        
        for(int i=pattern.length();i<word.length();i++){
            int start=i-pattern.length()+1;
            wordSet.put(word.charAt(start-1),wordSet.get(word.charAt(start-1))-1);
            if(wordSet.get(word.charAt(start-1))==0){
                wordSet.remove(word.charAt(start-1));
            }
             wordSet.put(word.charAt(i),wordSet.getOrDefault(word.charAt(i),0)+1);
            if(wordSet.equals(patternSet) && 
                check(word, pattern, start)){
                res.add(i-pattern.length()+1);
            }
        }
        return res;
        
    }

    public static ArrayList<Integer> improvedDistinctSearch(String word, String pattern){
        ArrayList<Integer> res= new ArrayList<>();

        int n=word.length();
        int m=pattern.length();

        for(int i=0;i<=n-m;){
            int j;
            for(j=0;j<m;j++){
                if(word.charAt(i+j)!=pattern.charAt(j))break;
            }
            if(j==m)res.add(i);
            if(j==0){
                i++;
            }else{
                i+=j;
            }
            
        }

        return res;
    }

    public static void main(String[] args) {
        String word="AAAAA";
        String pattern="AAA";
        ArrayList<Integer> res= findLoc(word, pattern);
        System.out.println(res);
        String w="GEEKSFORGEEKS";
        String p="EKS";
        ArrayList<Integer> distinctRes= improvedDistinctSearch(w,p);
        System.out.println(distinctRes);
    }
}
