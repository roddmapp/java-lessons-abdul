package ByteArrayOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream {
    public static void main(String[] args) throws IOException {
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        //You can write the contents of the byte array to a file
        bos.writeTo(new FileOutputStream("C:/synthesis/Test.txt"));

        /*byte b[] = bos.toByteArray();

        for (byte x: b)
            //Prints ASCII codes if it's not Type Cast to char
            System.out.println((char)x);*/

        bos.close();
    }
}
