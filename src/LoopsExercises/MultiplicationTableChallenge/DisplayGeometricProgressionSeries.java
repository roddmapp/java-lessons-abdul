package LoopsExercises.MultiplicationTableChallenge;

import java.util.Scanner;

public class DisplayGeometricProgressionSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the initial value of series: ");
        int initial = sc.nextInt();

        System.out.println("Please specify number of items in series: ");
        int n = sc.nextInt();

        System.out.println("Please specify how many numbers to increase by: ");
        int changeNumber = sc.nextInt();

        int temporary = initial;

        for (int i = 0; i <= n; i++) {
            System.out.println(temporary+",");
            temporary=temporary*changeNumber;
        }


    }

}
