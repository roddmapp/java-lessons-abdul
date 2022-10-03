import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingMapExamples {
    public static void main(String[] args) {

        /**
         * 1. Iterating over Map.entrySet() using For-Each loop :
         * Map.entrySet() method returns a collection-view(Set<Map.Entry<K, V>>) of the mappings contained in this map.
         * So we can iterate over key-value pair using getKey() and getValue() methods of Map.Entry<K, V>.
         * This method is most common and should be used if you need both map keys and values in the loop.
         * Below is the java program to demonstrate it.
         */
        // Java program to demonstrate iteration over
        // Map.entrySet() entries using for-each loop

                Map<String,String> gfg = new HashMap<String,String>();

                // enter name/url pair
                gfg.put("GFG", "geeksforgeeks.org");
                gfg.put("Practice", "practice.geeksforgeeks.org");
                gfg.put("Code", "code.geeksforgeeks.org");
                gfg.put("Quiz", "quiz.geeksforgeeks.org");

                // using for-each loop for iteration over Map.entrySet()
                for (Map.Entry<String,String> entry : gfg.entrySet())
                    System.out.println("Key = " + entry.getKey() +
                            ", Value = " + entry.getValue());

                Map<String, String> mytest = new HashMap<>();

                mytest.put("1", "one");
                mytest.put("2", "two");
                mytest.put("3", "three");
                mytest.put("4", "four");
                mytest.put("5", "five");

                for (Map.Entry<String, String> iterating: mytest.entrySet()) {
                    System.out.println("Key: " + iterating.getKey()
                                      + " Value: " + iterating.getValue());
                }

        /**
         * 2. Iterating over keys or values using keySet() and values() methods
         * Map.keySet() method returns a Set view of the keys contained in this map and Map.values() method returns a collection-view of the values contained in this map.
         * So If you need only keys or values from the map, you can iterate over keySet or values using for-each loops.
         * Below is the java program to demonstrate it.
         */

        Map<String,String> sites = new HashMap<String,String>();

        // enter name/url pair
        sites.put("GFG", "geeksforgeeks.org");
        sites.put("Practice", "practice.geeksforgeeks.org");
        sites.put("Code", "code.geeksforgeeks.org");
        sites.put("Quiz", "quiz.geeksforgeeks.org");

        // using keySet() for iteration over keys
        for (String name : sites.keySet())
            System.out.println("key: " + name);

        // using values() for iteration over values
        for (String url : sites.values())
            System.out.println("value: " + url);



    /**3. Iterating using iterators over Map.Entry<K, V>
     * This method is somewhat similar to first one.
     * In first method we use for-each loop over Map.Entry<K, V>, but here we use iterators.
     * Using iterators over Map.Entry<K, V> has it’s own advantage,i.e. we can remove entries from the map during iteration by calling iterator.remove() method.
     */

    Map<String,String> sites2 = new HashMap<String,String>();

    // enter name/url pair
        sites2.put("GFG", "geeksforgeeks.org");
        sites2.put("Practice", "practice.geeksforgeeks.org");
        sites2.put("Code", "code.geeksforgeeks.org");
        sites2.put("Quiz", "quiz.geeksforgeeks.org");

    // using iterators
    Iterator<Map.Entry<String, String>> itr = sites2.entrySet().iterator();

        while(itr.hasNext())
    {
        Map.Entry<String, String> entry = itr.next();
        System.out.println("Key = " + entry.getKey() +
                ", Value = " + entry.getValue());
    }


        /**
         * 4. Using forEach(action) method :
         * In Java 8, you can iterate a map using Map.forEach(action) method and using lambda expression.
         * This technique is clean and fast.
         */

        Map<String,String> sites3 = new HashMap<String,String>();

        // enter name/url pair
        sites3.put("GFG", "geeksforgeeks.org");
        sites3.put("Practice", "practice.geeksforgeeks.org");
        sites3.put("Code", "code.geeksforgeeks.org");
        sites3.put("Quiz", "quiz.geeksforgeeks.org");

        // forEach(action) method to iterate map
        sites3.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));

        /**
         * 5. Iterating over keys and searching for values (inefficient)
         * Here first we loop over keys(using Map.keySet() method) and then search for value(using Map.get(key) method) for each key.
         * This method is not used in practice as it is pretty slow and inefficient as getting values by a key might be time-consuming.
         */

        Map<String,String> sites4 = new HashMap<String,String>();

        // enter name/url pair
        sites4.put("GFG", "geeksforgeeks.org");
        sites4.put("Practice", "practice.geeksforgeeks.org");
        sites4.put("Code", "code.geeksforgeeks.org");
        sites4.put("Quiz", "quiz.geeksforgeeks.org");

        // looping over keys
        for (String name : sites4.keySet())
        {
            // search  for value
            String url = sites4.get(name);
            System.out.println("Key = " + name + ", Value = " + url);
        }
    }
}

