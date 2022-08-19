package LoopsExercises.MultiplicationTableChallenge;

import java.util.Scanner;

public class DisplayArithmeticProgressionSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers in series: ");
        int n = sc.nextInt();

        System.out.println("Enter the initial value of the series: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter how many numbers to increase the AP series by: ");
        int changeValue = sc.nextInt();

        int temporary = firstNumber;

        for (int i = 0; i <= n; i++) {
            System.out.print(temporary+ ",");
            temporary=temporary+changeValue;
        }
    }
}
