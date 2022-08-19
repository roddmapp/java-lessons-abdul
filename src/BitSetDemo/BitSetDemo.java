package BitSetDemo;

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        //In BitSet we have an array of bits 0 or 1. Useful when you are developing a logical application
        BitSet bs1 = new BitSet();

        //set makes these bits to be set to 1. If a bit is not set it will be 0.
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);

        BitSet bs2 = new BitSet();
        bs2.set(0);
        bs2.set(1);
        bs2.set(2);
        bs2.set(3);
        bs2.set(4);
        bs2.set(5);
        bs2.set(6);
        bs2.set(7);
        bs2.set(8);

        bs1.and(bs2); //performing and operation on the bits
        bs1.or(bs2);  //performimg or operation on the bits
        bs1.flip(0,bs1.length()); // flipping the bits from beginning to the end. This gives us [1, 3, 5, 7]
        System.out.println(bs1);
    }
}
