package DataInputandOutputStream;

import java.io.*;

class Student {
    int rollno;

    float avg;
    String name;
    String dept;
}

public class DataStreamDemo {
    public static void main(String[] args) throws Exception {

        /**
         * WRITING TO A FILE USING THEIR DATA TYPES INSTEAD OF STRING USING DataOutPutSteam
         */

        /*
        FileOutputStream fos = new FileOutputStream("D:\\Finsurv\\MyStudent2.txt");

        //Allows us to write objects of the class using their datatypes instead of using a String and typecasting when reading the data
        DataOutputStream dos = new DataOutputStream(fos);

        Student s = new Student();

        s.rollno = 200;
        s.avg = 75.77f;
        s.name = "John";
        s.dept = "CES";
        //Output shows funny characters because the file it produces is not a text file nut a binary file
        dos.writeInt(s.rollno);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);

        dos.close();
        fos.close(); */

        /**
         * READING THE DATA USING DATAINPUTSTREAM
         */
        FileInputStream fis = new FileInputStream("D:\\Finsurv\\MyStudent2.txt");
        DataInputStream dis = new DataInputStream(fis);

        Student s = new Student();

        // Please note: If you change the order there is going to be a file not found Exception
        // The order has to be same as the order you used to write the data
        s.rollno = dis.readInt();
        s.avg = dis.readFloat();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();

        System.out.println("Roll no: "+ s.rollno);
        System.out.println("Name: "+ s.name);
        System.out.println("Average: "+ s.avg);
        System.out.println("Department: "+ s.dept);

        dis.close();
        fis.close();

        //Serialization is the process of storing the stste of an object and retrieving the state of the object.
        //Instead of reading and writing the data types and values one at a time
        //1. To use ObjectInputStream or ObjextOutputStream the class must implement from Seriazable class
        //2. The class must have a default construcctor
        //3. If the class has static or transient methods they will not be stored or serialized. We can serialize only none static or transient methods. If there are any methods you don't want to serialize make them static

    }
}
