package LoopsExercises.MultiplicationTableChallenge;

import java.util.Scanner;

public class FindingSumOfNumbersChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum+=i;
        }

        System.out.println("Sum of " + n + " numbers is " + sum);
    }
}
