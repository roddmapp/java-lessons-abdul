package LoopsExercises.MultiplicationTableChallenge;

import java.util.Scanner;

public class DisplayFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please specify number of items in series: ");
        int n = sc.nextInt();

        int first=0, second=1,third;

        System.out.print(first + "," + second + ",");

        for (int i = 0; i<n-2; i++) {
            third= second+first;
            System.out.print(third+",");
            first=second;
            second=third;
        }
    }
}
