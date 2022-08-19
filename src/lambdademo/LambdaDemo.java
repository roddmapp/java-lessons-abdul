package lambdademo;

@FunctionalInterface
interface MyLambda {
    public int add(int a, int b);
}

/*class My implements MyLambda{
    @Override
    public void display() {
        System.out.println("Hello World");
    }
}*/

public class LambdaDemo {
    public static void main(String[] args) {
       /* MyLambda m = new MyLambda(){
            public int add(int a, int b ) {
                return a + b;
            }
        };*/
        MyLambda m = (a, b) -> a + b;;
        int result = m.add(14, 56);
        System.out.println(result);
    }
}

/*interface MyLambda{
    public void display()
}

class useLambda
{
    public void callLambda(My Lambda ml){
        ml.display()
    }
}

class Gemo {
    public void method1() {
        useLambda ul = new useLambda();
        ul.callLambda(() -> {
            System.out.println("Hello World");
        });
    }
}*/

