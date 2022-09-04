package MethodPractice;

public class SumOfAllElementsUsingVarArgs {

    static int sumElements(int ...A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The sum is: => " + sumElements(10, 20, 30, 100, 300, 1000));
    }
}
