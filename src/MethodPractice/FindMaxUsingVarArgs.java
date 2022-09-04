package MethodPractice;

public class FindMaxUsingVarArgs {

    static int max(int ...A) {
        if (A.length == 0) {return Integer.MIN_VALUE;}

        int newMax= A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > newMax) {
                newMax = A[i];
            }
        }
        return newMax;
    }
    public static void main(String[] args) {

        System.out.println(max(10, 20, 30, 3, 89, 8, 100, 9));

    }
}
