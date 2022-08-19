package fileexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        /**
         * File Writing: How to write a File to a .txt file
         */
       /* try {
            try (FileOutputStream fos = new FileOutputStream("C:/synthesis/Test2.txt")) {
                String str = "Learn Java Programming";

                //First Method of writing this Program
                //fos.write(str.getBytes());

                //Second method of writing this program using byte array
                byte b[] = str.getBytes();

                //using offset
                fos.write(b, 6, str.length() - 6);
//            for(byte x: b)
//                fos.write(x);

                fos.close();
            }

        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }*/

        /**
         * Reading words from a file using FileInputStream
         */
        try (FileInputStream fis = new FileInputStream("C:/synthesis/Test.txt"))
        {
            /*byte b[] = new byte[fis.available()];

            fis.read(b);

            String str = new String(b);

            System.out.println(str);*/

            /**
             * Another method reading one byte at a time and using a do whilw loop
             */

            int x;
            //Instead of using a do while loop we can use a while loop like below
            // while((x=fis.read()!=-1){System.out.print((char)x}
            do {
                //Read a byte ASCII code
                x = fis.read();
                if (x!=-1)
                //ASCII code is type cast to a character
                    System.out.print((char)x);
            } while(x!=-1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
