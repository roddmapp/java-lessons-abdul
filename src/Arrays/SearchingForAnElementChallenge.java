package Arrays;

import java.util.Scanner;

public class SearchingForAnElementChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number to search for: ");

        int key = sc.nextInt();

        int A[] = {10, 3, 2, 9, 29, 34, 33, 56};

        for (int i = 0; i < A.length; i++) {
            if (A[i] == key) {
                System.out.println("Number found in array at index " + i);
                System.exit(0);
            }
        }

        System.out.println("Number not found");
    }
}
