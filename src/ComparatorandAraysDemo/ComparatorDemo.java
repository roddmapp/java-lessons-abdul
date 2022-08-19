package ComparatorandAraysDemo;

import java.util.Arrays;
import java.util.Comparator;

//If you are defining your own class you must define your own Comparator
class My implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
        if(i1<i2)
            return 1; //reversing the order
        if(i1>i2)
            return -1; //reversing the order
        return 0;
    }
}


public class ComparatorDemo {
    public static void main(String[] args) {
        /*int[] a =  {2,4,6,8,1,3,5};
        int[] b =  {2,4,6,8,1,3,5};

        int[] c = Arrays.copyOf(a, a.length);//copying to the 4th element
        //int[] c = Arrays.copyOf(a, a.length); copying till the end
        //Arrays.fill(c,10); filling the array with the same values 10
        Arrays.sort(c); //sorting the array values in chronological order
        for (int x: c)
            System.out.println(x);

        //comparing the two arrays
        System.out.println(Arrays.compare(a,b));
        System.out.println(Arrays.binarySearch(c, 2)); //Gives back index 1. BinarySearch can only be performed when the elements in array are sorted (c are sorted)*/

        //An integer object array instead of using primitive types

        Integer[] a = {2,4,6,8,1,3,5};

        //using normal sort
        //Arrays.sort(a);

        //usiing sort with custom Comparator defined above
        // it's going to get sorted in reverse order
        Arrays.sort(a, new My());

        for (Integer x: a)
            System.out.println(x);

    }
}
