package BufferedInputAndOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputAndOutputStream {
    public static void main(String[] args) throws Exception{

        /**
         * BufferedInput and BufferedOutput Streams are faster because they use a buffer.
         * A buffer is used if two devices have different speeds of producing and consuming data
         */
        //Create a FileInputStream
        FileInputStream fis = new FileInputStream("C:/synthesis/Test2.txt");
        //Connect the FileInputStream to the BufferedInputStream
        BufferedInputStream bis = new BufferedInputStream(fis);

        /**
         * USING BUFFERREADER IS THE SAME IMPLEMENTATION AS WHE USING BUFFEREDINPUTSTREAM
         * //Create a FileInputStream
         *   FileReader fis = new FileReader("C:/synthesis/Test2.txt");
         * //Connect the FileInputStream to the BufferedInputStream
         *   BufferedReader bis = new BufferedReader(fis);
        * */

        int x;

        while((x=bis.read())!=-1){
            System.out.print((char)x);
        }

    }
}
