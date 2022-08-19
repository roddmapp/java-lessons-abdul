package ArrayDequeDemo;

import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq =new ArrayDeque<>();

        // inserting elements using it as a Stack
        /// all elements are inserted in constant time it's faster to use an ArrayDeque
        dq.offerLast(10); // 10, 20, 30, 40
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.pollLast(); // acting like a Stack since we are now deleting from the first element on top last element in first out
        dq.pollFirst(); // implementing a queue inserting from last but deleting from first

        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

        dq.forEach((x)-> System.out.println(x));

    }
}
