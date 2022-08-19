package GenericDemo;

/*public class GenericDemo<T> //Class should have generic here
{
    // We usually only use T but there are other letters which can be used
    T[] data = (T[]) new Object[3]; //An array of any data type using generics

    public static void main(String[] args) {
        GenericDemo<String> gd = new GenericDemo();// The array becomes a String or GenericDemo<Integer> data the array becomes an Integer because T becomes an Integer

        gd.data[0] = "hi";
        gd.data[1] = "world";
        gd.data[2] = "10";

        //The object behaves as a String only, you don't have to typecast it
        String str = gd.data[0];


    }
}*/

/*class Data<T> {
    private T obj;

    public void setData(T v) {
        obj = v;
    }

    public T getData() {
        return obj;
    }

}

public class GenericDemo {
    public static void main(String[] args) {
        Data<Integer> d = new Data<Integer>();
        d.setData(10); // its autoBoxing here otherwise we can write d.setData(new Integer(10)

        System.out.println(d.getData());
    }
}*/

@SuppressWarnings("unchecked")

class MyArray<T> // You can add two arguments (parameters) for key value pairs e.g <K,V>
{
    T A[] = (T[]) new Object[10]; //generic type array
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

/*A class inheriting from a generic class is a generic class if you don't specify the type it will be of type object*/
/*

class A{}                       interface A{}
class B extends A{}             class B implements A{}
class C extends C{}             class C implements C{}

class MyArray<T extends A> //even if the class implements from interface we use extends not implements
* e.g class MyArray2 extends MyArray<String> --
  e.g class MyArray2<T> extends MyArray<T>
* */

/*
* Bounded Types
* [Number - PARENT] - these classes are wrapper classes which inherit from the class Number [CHILD - Byte, short, Integer, float, long
* class MyArray<T extends Number> -- take any class here but must be of number type
*
* MyArray<Double> ma= new MyArray<>();
* ma.append(12.5)
* ma.append(10.0)
*
* MyArray<Integer> ma = new MyArray<>();
* ma.append(10)
* ma.append(30)*/

public class GenericDemo {
    public static void main(String[] args) {
        MyArray<Integer> ma = new MyArray<Integer>(); //If you don't specify any tpe it will be an object type MyArray ma = new MyArray();

                        //You can do the below if you don't specify the type
        ma.append(10);  // ma.append("Hi");
        ma.append(20);  // ma.append(10);
        ma.append(30);  // ma.append("GO");
        ma.append(40);

        ma.display();
    }
}

/**
 * DO's AND DONT'S IN GENERICS
 * 1. Only extends is allowed in Generic class definition, you should not use implements
 * 2. Extends is used for interface also
 * 3. Extends from only one class and multiple interfaces
 * 4. Extends and super are allowed with ? in methods not in class definitions --? is wildcard static void fun(MyArray<? extends Number>)
 * 5. <?> will accept all types but cannot access public static void fun(MyArray<?> obj)
 * 6. Base type of an Object should be same or ?
 *
 */
