import java.util.*;
public class TheOddOneOut {
    public static void main(String[] args) {
       Scanner sc=  new Scanner(System.in);
        String one = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<one.length();i++){
            map.put(one.charAt(i),map.getOrDefault(one.charAt(i),0)+1);
            
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}