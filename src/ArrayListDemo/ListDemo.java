package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>(20);  //LinkedList works the same except you can't specify initial size LinkedList<Integer> all = new LinkedList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));

        all.add(10);
        all.add(0,5);
        all.addAll(al2);

        System.out.println(all.contains(100));

        System.out.println(all.get(6));

        System.out.println(all);

        //Iterating through an ArrayList
        //1. Using for loop
        for (int i = 0; i < all.size(); i++){
            System.out.println(all.get(i));
        }

        //2. Using Foreach loop
        for(Integer x: all) {
            System.out.println(x);
        }

        //3. Using iterator
        for (Iterator<Integer> it = all.iterator(); it.hasNext();) {
            java.lang.Integer x = it.next();
            System.out.println(x);
        }

        //4. Using Lambda forEach
        all.forEach((x) -> {
            System.out.println(x);
        });
        // Can also be simplified to the below using scope resolution and lambda expression
        all.forEach(System.out::println);

        //5. Using Iterator and while loop
        Iterator<Integer> it = all.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //6. Using ListIterator - ListIterator allows bidirectional access
        ListIterator<Integer> lit = all.listIterator();

        while(lit.hasNext()) //ListIterator also has hasPrevious method
        {
            System.out.println(lit.next()); //also has has previous -can move backwards
        }



    }
}
