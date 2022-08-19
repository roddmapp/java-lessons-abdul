package LinkedHashMapDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {
    public static void main(String[] args) {
        //LinkedHashMap can be used as a cache memory
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5,0.75f, true) {
            //You can add an anonymous function to remove the least recently used element from the Map in this case it's 3
            //We are saying remove the least recently used/oldest entry if the size of the Map is greater than 5 and keeps the size as the same at 5
            @Override
            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > 5;
            }
        };

        //Ordering based on insertion order
        //LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5); // new LinkedHashMap<>(5, .75f --loading factor, true - means we are printing according to their order of access)

        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");

        String s = lhm.get(2);
        s=lhm.get(5);
        s=lhm.get(1);
        lhm.put(8,"F");

        //When printing the values the order of the keys is maintained it's not changed
        lhm.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
