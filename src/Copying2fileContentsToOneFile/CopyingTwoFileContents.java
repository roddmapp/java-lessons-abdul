package Copying2fileContentsToOneFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CopyingTwoFileContents {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream("Source1.txt");
        FileInputStream fis2 = new FileInputStream("Source2.txt");

        FileOutputStream fos = new FileOutputStream("Destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int b;

        while((b=sis.read())!=-1) {
            fos.write(b);
        }

        sis.close();
        fis1.close();
        fis2.close();
    }
}
