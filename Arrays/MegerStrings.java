package Arrays;
import java.util.*;
public class MegerStrings {
    static class Node{
        char c ;
        int freq;
        int s;
        Node(char c, int freq, int s){
            this.c=c;
            this.freq=freq;
            this.s=s;
        }
    }
    public static String merge(String str1, String str2){
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
        }
        for(int i=0;i<str2.length();i++){
            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
        }
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->{
            if(a.freq!=b.freq) return Integer.compare(b.freq,a.freq);
            if(a.freq==b.freq && a.c!=b.c) return Integer.compare(a.s, b.s);
            return Character.compare(a.c, b.c);
        });

        for(char c : map1.keySet()){
            pq.offer(new Node(c,map1.get(c),0));
        }
        for(char c : map2.keySet()){
            pq.offer(new Node(c,map2.get(c),1));
        }
        while(!pq.isEmpty()){
            Node arr = pq.poll();
            sb.append(arr.c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s1 = "himi";
        String s2="Akashaa";
        System.out.println(merge(s1, s2));
    }
}
