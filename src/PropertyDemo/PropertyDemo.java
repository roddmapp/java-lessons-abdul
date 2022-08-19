package PropertyDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) throws Exception {
        //Properties class inherits from Hashtable it only stores String key and value methods only
        Properties p = new  Properties();

        //used to save properties as key value pair
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "CoreI7");
        p.setProperty("OS", "Windows 10");
        p.setProperty("Model", "Latitude");

        //saving the properties key value pairs to a file
        p.store(new FileOutputStream("C:/Users/RodneyMapako/Documents/MyData.txt"), "Laptop");

        //saving the properties key value pairs to a xml file
        p.storeToXML(new FileOutputStream("C:/Users/RodneyMapako/Documents/MyData.xml"), "Laptop");

        //printing the values
        System.out.println(p);
    }
}
