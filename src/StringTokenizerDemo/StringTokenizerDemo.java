package StringTokenizerDemo;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) throws Exception{

        /*//We can read the data from a File
        FileInputStream fis = new FileInputStream("C:Users/RodneyMapako/Documents/MyData.txt");
        byte[] b = new byte[fis.available()];
        fis.read(b);

        String data = new String(b);

        //String data = "name=Rodney;address=joburg;country=southafrica;dept=cse";

        StringTokenizer stk = new StringTokenizer(data,"=");

        String s;

        while(stk.hasMoreElements()) {
            s=stk.nextToken();
            System.out.println(s);
        }*/

        //We can read the data from a File we are reading numbers from a file
        FileInputStream fis = new FileInputStream("C:Users/RodneyMapako/Documents/Data.txt");
        byte[] b = new byte[fis.available()];
        fis.read(b);

        String data = new String(b);

        StringTokenizer stk = new StringTokenizer(data,",");

        String s;
        ArrayList<Integer> al = new ArrayList<>();

        while(stk.hasMoreElements()) {
            s=stk.nextToken();
            al.add(Integer.valueOf(s)); //adding the numbers to ArrayList and converting the values to Integer
        }
        System.out.println(al);
    }
}
