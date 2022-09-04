package Arrays;

public class FindingLargestElementChallenge {
    public static void main(String[] args) {

        int A[] = {10, 3, 2, 9, 29, 99, 34, 33, 56};

        int max = A[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("The maximum number is: " + max);
    }
}
