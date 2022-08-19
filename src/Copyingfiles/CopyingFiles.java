package Copyingfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFiles {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Source1.txt");
        FileOutputStream fos = new FileOutputStream("Source2.txt");

        int b;
        while((b=fis.read())!=-1) {
            //ASCII code for UpperCaseLetters are 65 - 90 and for Lowercase it's 97 - 122
            if (b>=65 && b<=120)
                fos.write(b+32);
            else
                fos.write(b);
        }

        fis.close();
        fos.close();
    }
}
