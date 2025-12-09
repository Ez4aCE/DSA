package codeForces.Nov_Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class A {
        public ArrayList<Integer> primes(int n){
        
        ArrayList<Integer> p= new ArrayList<>();

        for(int i=2;i<=n;i++){
            boolean isPrime=true;
            for(int j=2;j<=(int)Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if( isPrime)p.add(i);
        }

        return p;
        
    }
    public boolean bs(int target, ArrayList<Integer> list){
        int left=0;
        int right=list.size()-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(list.get(mid)==target){
                return true;
            }
            if(list.get(mid)<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }


        return false;
    }
    public int largestPrime(int n) {
        if(n==1)return 0;
        if(n==2)return 2;
        ArrayList<Integer> primes=primes(n);
        
        int largest=0;
        int sum=0;
        
        for(int i=0;i<primes.size();i++){
            sum+=primes.get(i);
            if(sum>primes.get(primes.size()-1))break;
            if(bs(sum,primes))largest=sum;
        }

        return largest;
    }
    public static void main(String[] args) {
       A obj = new A();
       int res=obj.largestPrime(20);
       System.out.println(res);
    }
}
