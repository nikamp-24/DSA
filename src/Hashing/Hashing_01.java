package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing_01 {
    public static void main(String[] args) {

//        HashSet

        HashSet<Integer> set = new HashSet<>();

//        add elements

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3); // it will not store 1 again no duplicates allowed in set

        System.out.println("The size of set is: "+set.size());
//
//        System.out.println(set);
////        search - contains
//
//       if ( set.contains(1)){
//           System.out.println("Set contains 1");
//       }
//       if (!set.contains(5)){
//           System.out.println("Set does not contains 5");
//       }
//
////       delete
//
//        set.remove(1);
//       if (!set.contains(1)){
//           System.out.println("We deleted 1");
//       }


//        Iterator has two methods hasnext() and next

        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
