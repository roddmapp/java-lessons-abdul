package SerializingACustomerObject;

import java.io.*;

class Customer implements Serializable {
    String custID;
    String name;
    String phno;

    static int count = 1;

    public Customer() {

    }

    Customer(String n, String p) {
        custID="C" + count;
        count++;
        name = n;
        phno = p;
    }

    public String toString() {
        return "Customer ID: " + custID +
                "\nName: " + name +
                "\nPhone: " + phno + "\n";
    }
}

public class CustomerMain {
    public static void main(String[] args) throws Exception{

        /* Customer[] list = ((new Customer("Smith", "0754894433")),(new Customer("John", "08744635322")),(new Customer("Peter", "0673329383")));

        FileOutputStream fos = new FileOutputStream("D:\\Finsurv\\Customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(list.length);

        for (Customer c : list) {
            oos.writeObject(c);
            oos.close();
            fos.close();
        }
            */

        java.util.Scanner sc = new java.util.Scanner(System.in);

        FileInputStream fis = new FileInputStream("D:\\\\Finsurv\\\\Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();

        Customer[] list = new Customer[length];

        for (int i = 0; i < length; i++) {
            list[i] = (Customer)ois.readObject();
        }

        System.out.println("Enter Name Of Customer");
        String name = sc.nextLine();

        for (int i = 0; i<length; i++) {
            if (name.equalsIgnoreCase(list[i].name))
                System.out.println(list[i]);
        }

        ois.close();
        fis.close();


    }
}
