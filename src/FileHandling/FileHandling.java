package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Finsurv");

        System.out.println(f.isDirectory());

        File[] list= f.listFiles();

        assert list != null;
        for(File s:list) {
            System.out.println(s.getName() + " ");
            //Get Path to the File
            System.out.println(s.getPath());
            //Get the Parent directory
            System.out.println(s.getParent());
            System.out.println(s.getCanonicalPath());
        }
    }
}
