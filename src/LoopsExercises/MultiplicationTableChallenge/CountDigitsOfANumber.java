package LoopsExercises.MultiplicationTableChallenge;

import java.util.Scanner;

public class CountDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter digits: ");
        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {
            n = n/10;

            count++;
        }
        System.out.println("Number of digits are: " + count);
    }
}
