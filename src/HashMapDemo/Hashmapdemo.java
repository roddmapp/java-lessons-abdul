package HashMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmapdemo {
    public static void main(String[] args) {
        HashMap<Integer, String> tm = new HashMap<>(Map.of(0,"A",1,"B",2,"C"));
        //adding values to HashMap<Integer, String>
        tm.put(4,"E");
        tm.put(5,"F");
        tm.put(6,"G");
        tm.put(7,"H");

        System.out.println(tm.get(5)); // getting the valueof key by putting key
        System.out.println(tm);
    }
}
