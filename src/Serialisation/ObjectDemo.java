package Serialisation;

//Serialization is the process of storing the stste of an object and retrieving the state of the object.
//Instead of reading and writing the data types and values one at a time
//1. To use ObjectInputStream or ObjextOutputStream the class must implement from Serializable class
//2. The class must have a default constructor
//3. If the class has static or transient methods they will not be stored or serialized. We can serialize only none static or transient methods. If there are any methods you don't want to serialize make them static

import java.io.*;
import java.util.Map;

// Serializable is an interface without methods we don't have to override any methods
class Student implements Serializable {
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;


    public Student () {}

    public Student(int r, String n, float a, String d) {
        rollno = r;
        name = n;
        avg = a;
        dept = d;
        Data = 500;
        t = 500;
    }

    public String toString() {
        return "\nStudent Details\n" +
                "\nRoll " + rollno +
                "\nName " + name +
                "\nAverage " + avg +
                "\nDept " + dept +
                "\nData " + Data +
                "\nTransient " + t + "\n";
    }
}

public class ObjectDemo {
    public static void main(String[] args) throws Exception{

        /**
         * Writing the Data using FileOutputStream and ObjectOutputStream for Serialising the Student object 
         */
        
        /*FileOutputStream fos = new FileOutputStream("D:\\Finsurv\\Student3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s = new Student(10,"John",79.9f,"CSE");

        oos.writeObject(s);

        oos.close();
        fos.close(); */

        FileInputStream fis = new FileInputStream("D:\\Finsurv\\Student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Student s = (Student)ois.readObject();

        System.out.println(s);

        ois.close();
        fis.close();

            }


}
