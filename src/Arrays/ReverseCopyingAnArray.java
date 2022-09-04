package Arrays;

import java.util.Scanner;

public class ReverseCopyingAnArray {
    public static void main(String[] args) {

        int[] A = {3, 19, 3, 8, 10, 89, 100};

        int[] B = new int[7];

        for (int i = A.length -1; i >= 0; i--) {
            B[i] = A[i];
            B=A;
            System.out.println(B[i]);
        }
    }
}
