package LoopsExercises.MultiplicationTableChallenge;

import java.util.Scanner;

public class DisplayDigitsChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter digits: ");
        int n = sc.nextInt();
        int r;

        while(n > 0) {
            r = n%10;
            n=n/10;

            System.out.println(r);
        }

    }
}
