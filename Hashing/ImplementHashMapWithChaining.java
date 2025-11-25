package Hashing;
import java.util.*;
public class ImplementHashMapWithChaining {
    static class HS{
        int mod;
        LinkedList<Integer>[] store;
        public HS(){
            mod=7;
            store=new LinkedList[7];
            for (int i=0;i<store.length;i++){
                store[i]=new LinkedList<>();
            }
        }
        public void insert(int n){
            int index=n%mod;
            
            store[index].add(n);
        }
        public boolean search(int n){
            int index=n%mod;
            if(store[index].contains(n))return true;
            return false;
        }
        public void delete(int n){
            int index=n%mod;
            store[index].remove(Integer.valueOf(n));
        }
        public void view(){
            for(int i=0;i<store.length;i++){
                if(!store[i].isEmpty()){
                    System.out.println(store[i]);
                }
            }
        }
    }
    static class HM{
        int mod;
        ArrayList<LinkedList<Node>> store;

        public HM(int size){
            mod=size;
            store=new ArrayList<>();
            for(int i=0;i<size;i++){
                store.add(new LinkedList<>());
            }

        }
        static class Node {
            int key;
            String val;

            Node(int key, String val) {
                this.key = key;
                this.val = val;
            }
}

        public void insert(int k,String v){
            int index=k%mod;
            
            store.get(index).add(new Node(k,v));
        }
        public String search(int k){
             int index=k%mod;
            
            ListIterator<Node> lt= store.get(index).listIterator();
            while(lt.hasNext()){
                Node curr = lt.next();
                if(curr.key==k){
                    return curr.val;
                }
            }
            
            return "";
        }
        public void delete(int k){
            int index=k%mod;
            ListIterator<Node> lt= store.get(index).listIterator();
            while(lt.hasNext()){
                Node curr=lt.next();
                if(curr.key==k){
                    lt.remove();
                    return;
                }
            }
        }
        public void view(){
            for(int i=0;i<store.size();i++){
                if(!store.get(i).isEmpty()){
                    ListIterator<Node> lt= store.get(i).listIterator();
                    while(lt.hasNext()){
                        Node currNode=lt.next();
                        System.out.print("Key : "+currNode.key+" "+"Value : "+currNode.val+ " # ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        /*
        HS Hash = new HS();
        Hash.insert(5);
        Hash.insert(7);
       
        Hash.insert(70);
        Hash.insert(71);
        Hash.insert(9);
        Hash.insert(56);
        Hash.insert(72);
         Hash.view();
         System.out.println(Hash.search(7));
         System.out.println(Hash.search(711));
         Hash.delete(7);
         Hash.delete(5);
         Hash.view();
         */
        HM hm= new HM(7);
        hm.insert(5,"hello");
        
       
        hm.insert(70,"hio");
        hm.insert(71,"bye");
        hm.insert(9,"syaona");
        hm.insert(56,"sayonara");
        hm.insert(72,"bye bye");
         hm.view();
         System.out.println(hm.search(71));
         System.out.println(hm.search(711));
         hm.delete(7);
         hm.delete(5);
         hm.view();

    }
}
