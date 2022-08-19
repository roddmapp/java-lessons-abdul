package TreeMapDemo;

import java.util.Map;
import java.util.TreeMap;

public class Treemapdemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"C"));
        //adding values to TreeMap<Integer, String>
        tm.put(4,"E");
        tm.put(5,"F");
        tm.put(6,"G");
        tm.put(7,"H");

        System.out.println(tm.ceilingEntry(3).getValue()); //get value of key
        System.out.println(tm.get(5)); // getting the valueof key by putting key
        System.out.println(tm);
    }
}
