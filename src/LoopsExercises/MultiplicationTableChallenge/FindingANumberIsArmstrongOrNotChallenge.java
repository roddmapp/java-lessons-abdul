package LoopsExercises.MultiplicationTableChallenge;

import java.util.Scanner;

public class FindingANumberIsArmstrongOrNotChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter digits to check if Armstrong or not: ");
        int n = sc.nextInt();

        int r;
        int sum = 0;
        int m=n;

        while (n > 0) {
            r = n%10;
            n = n/10;
            sum = sum + r*r*r;
        }

        if (sum == m) {
            System.out.println("Since " + sum + " is equal to " + m  + " this number is an Armstrong Number");
        } else
            System.out.println("Since " + sum + " is not equal to " + m  + " this number is NOT an Armstrong Number");


    }
}
