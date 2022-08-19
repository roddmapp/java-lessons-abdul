package TreeSetDemo;

import java.util.List;
import java.util.TreeSet;

class Point implements Comparable{
    //two coordinates
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Overriding toString so that we can be able to print using System.out.println
    public String toString() {
        return "x = "+x+" y = "+y;
    }

    // overriding CompareTo method of Comparable to use our own implementation of the method
    public int compareTo(Object o) {
        Point p = (Point)o;

        if (this.x<p.x)
            return -1;
        else if (this.x>p.x) {
            return 1;
        }
        else {
            if (this.y<p.y)
                return -1;
            else if (this.y>p.y) {
                return 1;
            }
            else
                return 0;
        }
    }

}
public class Treesetdemo {
    /*public static void main(String[] args) {
        /**
         * TreeSet returns all the elements sorted and does not return duplicates since it's a Set
         * TreeSet implements from SortedSet, Collection interfaces. We can do the below because of this
         * SortedSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40)); we can only use methods of the SortedSet
         * Collection<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40)); we can only use methods of Collection
         */
            //Takes lo(n) time to complete
       /* TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));

        ts.add(25);

        System.out.println(ts);*/ //returns the values sorted

    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();

        ts.add(new Point(1, 1));
        ts.add(new Point(5, 5));
        ts.add(new Point(5, 2));

        System.out.println(ts);
    }


}
