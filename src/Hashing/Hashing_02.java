package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing_02 {
    public static void main(String[] args) {
//        HashMap

//        Country(Key) , Population(Value)
        HashMap<String, Integer> map = new HashMap<>();

//        Insertion
        map.put("India", 5000);
        map.put("Dubai", 400);
        map.put("USA", 300);

        System.out.println(map);

//        updates the value if key is already present
        map.put("India", 4000);

//        search
//        if (map.containsKey("India")){
//            System.out.println("Key is present in the map");
//        }else {
//            System.out.println("Key is not present in the map");
//        }
//
////        to print the value of a key
////        if key exists it prints the value
//        System.out.println(map.get("India"));
////        if key does not exists it prints null
//        System.out.println(map.get("Indonesia"));

//        Iteration
//      for(int val : arr)
//        for (Map.Entry<String, Integer> e : map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        Set<String> keys =map.keySet();
//        for (String key : keys){
//            System.out.println(key+ " " + map.get(key));
//        }


        map.remove("India");
        System.out.println(map);
    }
}
