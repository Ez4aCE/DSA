import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsInEveryKWindow {
    public static ArrayList<Integer> countDistinctInK(int[] arr, int k){
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<k;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        res.add(map.size());

        for(int i=k;i<arr.length;i++){
             map.put(arr[i], map.getOrDefault(arr[i],0)+1);
             int remove=arr[i-k];
             map.put(remove,map.get(remove)-1);
             if(map.get(remove)==0)map.remove(remove);
             res.add(map.size());
        }


        return res;
    }

    public static void main(String[] args) {
        int[] arr1={10,20,20,10,30,40,10};
        int[] arr2={10,10,10,10};
        int[] arr3={10,20,30,40};
        System.err.println(countDistinctInK(arr1,4));
        System.err.println(countDistinctInK(arr2,3));
        System.err.println(countDistinctInK(arr3,3));
    }
}
