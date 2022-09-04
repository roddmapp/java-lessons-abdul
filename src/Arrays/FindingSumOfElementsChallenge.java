package Arrays;

public class FindingSumOfElementsChallenge {
    public static void main(String[] args) {

        int A[] = {3, 19, 3, 8, 10, 89, 100};

        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }

       /* for (int sumA: A){
            sum = sum + sumA;
        }*/

        System.out.println("The sum of figures in Array is: " + sum);
        System.out.format("The sum of the figures in Array is %d", sum);
    }
}
