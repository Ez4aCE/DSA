package codeForces.upsolve;

import java.util.Arrays;

public class m {
     public static int vowelCount(String str){
        int vowels=0;

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')vowels++;
        }
          return vowels;  
    }
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        
        int firstVowels=vowelCount(arr[0]);
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for(int i=1;i<arr.length;i++){
            sb.append(" ");
            int vowels=vowelCount(arr[i]);
            if(vowels==firstVowels){
                for(int j=arr[i].length()-1;j>=0;j--){
                    sb.append(arr[i].charAt(j));
                }
            }else{
                sb.append(arr[i]);
            }
        }

        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s = "banana ";
        String res=reverseWords(s);
        System.out.println(res);
    }
}
