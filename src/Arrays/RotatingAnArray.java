package Arrays;

public class RotatingAnArray {
    public static void main(String[] args) {

        int A[] = {10, 3, 2, 9, 29, 99, 34, 33, 56};

        //copy first element into temp variable and move the remaining values one place to the left
        int temp = A[0];

        for (int i = 1; i < A.length; i++) {
            A[i-1]=A[i];
            A[A.length-1]=temp;
            System.out.print(A[i] + " ,");
        }


    }
}
