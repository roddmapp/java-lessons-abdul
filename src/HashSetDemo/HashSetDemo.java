package HashSetDemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        /**
         * You can set the initial capacity of the table and it's loading factor e.g if we want only 25% e.g HashSet<Integer> hs = new HashSet<>(20, 0.25f);
         * The recommended loading factor is 75% only this percentage of the table will be filled 25% of the Hash Table will be wasted
         * If you add more elements after giving an initial capacity the size will increase automatically beyond the initial value
         * The operations are done in constant time: alg = size%10
         */
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10); // Set does not allow duplicates. This value will not be printed

        System.out.println(hs); //The values will not be printed in the same order
    }
}
