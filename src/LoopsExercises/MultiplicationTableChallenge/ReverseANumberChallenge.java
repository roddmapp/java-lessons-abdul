package LoopsExercises.MultiplicationTableChallenge;

import java.util.Scanner;

public class ReverseANumberChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int n = sc.nextInt();

        int remainder;
        int reverse = 0;

        while (n > 0) {
            remainder = n%10;
            reverse = reverse * 10 + remainder;
            n=n/10;
        }
        System.out.println("The reverse of " + n + " is " + reverse);

    }
}
