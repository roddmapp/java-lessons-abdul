package LambdaMethodReference;

interface MyLambda {
    public void display(String str);
}

public class LambdaDemo {

    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        /**
         * Same reference is used for calling different methods for a functional interface @FunctionalInterface(an interface with a single method).
         * You can assign any method which is taking a single string as a parameter and you can call that method
         */
        MyLambda ml = LambdaDemo::reverse;

        ml.display("Hello");
    }
}
