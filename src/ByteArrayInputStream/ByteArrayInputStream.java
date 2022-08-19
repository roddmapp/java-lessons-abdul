package ByteArrayInputStream;

import java.io.*;

public class ByteArrayInputStream {
    public static void main(String[] args) throws IOException {

        /* CharacterArrayInputStream is basically the same it just uses char instead of byte
            char c[] = {'a','b','c','d','e','f','g','h','i','j'};
            java.io.CharArrayInputStream cis = new CharArrayInputStream(c);
         */
        byte b[]={'a','b','c','d','e','f','g','h','i','j'};

        java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(b);

        /**
         * READING ONE BYTE AT A TIME
         */
        /*int x;

        while((x=bis.read())!=-1){
            System.out.print((char)x);
        }
        bis.close();*/

        /**
         * READING ALL OF THE BYTES
         */

        String str = new String(bis.readAllBytes());

        System.out.println(str);

        bis.close();

    }
}
