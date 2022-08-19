package LinkedHashSetDemo;

import java.util.Hashtable;
import java.util.LinkedHashSet;

public class LinkedHashsetdemo {
    public static void main(String[] args) {
        //Used if you want to return the elements in the same order as they were inserted HashSet returns the elements ordered
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10); //Does not give back elements in a sorted order like HashSet<>

        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");

        lhs.forEach(System.out::println); //printing using method reference

    }
}
