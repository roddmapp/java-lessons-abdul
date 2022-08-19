package PriorityQueueDemo;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyCom implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
      //Larger value will now have priority
      if (o1<o2) return 1;
      if (o1>o2) return -1;
      return 0;
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        //min value heap. The PriorityQueue uses min value heap and a Binary Tree for sorting values from the min to the max value
        //If we want the PriorityQueue to prioritise the max value we use a Comparator like above
        PriorityQueue<Integer> p = new PriorityQueue<>(new MyCom()); //(new MyComp())add this to change the priority to the max value

        p.add(10);
        p.add(20);
        p.add(5);
        p.add(15);
        p.add(3);

        // Instead of using add we can use offer also
        p.offer(78);
        // Finding the value of the Head element we use peek() returns 3
        System.out.println(p.peek());

        //Before Deletion
        p.forEach((x) -> System.out.println("Before Deletion: " + x));

        //Removing/Deleting the head element we use poll()
        p.poll();

        //displaying the elements using forEach with a lambda expression
        p.forEach((x) -> System.out.println("After Deletion: " + x));


    }
}
