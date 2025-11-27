package Hashing;

import java.util.Arrays;

public class OpenAddressingDoubleHash {
    static class HS{
        int[] store;
        int mod;
        public HS(){
            store =new int[7];
            mod=7;
            for(int i=0;i<7;i++){
                store[i]=-1;
            }
        }

        public boolean insert(int key){
            int h1=key%7;
                int h2=6-(key%6);
            for(int i=0;i<7;i++){
                
                int index=(h1+ i*h2)%7;
                if(store[index]==key){
                    return false;
                }
                if(store[index]==-1 || store[index]==-2){
                    store[index]=key;
                    return true;
                }
            }


            return false;
        }

        public boolean search(int key){
            int h1=key%7;
                int h2=6-(key%6);
            for(int i=0;i<7;i++){
                
                int index=(h1+ i*h2)%7;
                if(store[index]==key){
                    
                    return true;
                }else if(store[index]==-1){
                    return false;
                }
            }


            return false;
        }
        public boolean delete(int key){
            int h1=key%7;
                int h2=6-(key%6);
            for(int i=0;i<7;i++){
                
                int index=(h1+ i*h2)%7;
                if(store[index]==key){
                    store[index]=-2;
                    return true;
                }else if(store[index]==-1){
                    return false;
                }
            }


            return false;
        }
        
        public void view(){
            System.out.println(Arrays.toString(store));
        }

    }
    public static void main(String[] args) {
        HS hs = new HS();
        System.out.println( hs.insert(49));
        System.out.println( hs.insert(63));
        System.out.println( hs.insert(56));
        System.out.println( hs.insert(52));
        System.out.println( hs.insert(54));
        System.out.println( hs.insert(18));
        System.out.println( hs.insert(182));
        System.out.println( hs.insert(181));
       
       
        hs.view();
        System.out.println(hs.search(63) ? "YES" :" NO");
        System.out.println(hs.search(64) ? "YES" :" NO");
        hs.view();

        System.out.println(hs.delete(63) ? "yes" : "no");
        System.out.println(hs.delete(64) ? "yes" : "no");
        System.out.println(hs.delete(18) ? "yes" : "no");
         hs.view();
        
    }
}
