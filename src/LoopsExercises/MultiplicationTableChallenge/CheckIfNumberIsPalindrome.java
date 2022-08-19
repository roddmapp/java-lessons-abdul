package LoopsExercises.MultiplicationTableChallenge;

import java.util.*;

public class CheckIfNumberIsPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter digits: ");
        int n = sc.nextInt();
        int m = n;

        int reverse = 0;
        int remainder;

        while (n > 0) {
            remainder = n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }

        if (m == reverse) {
            System.out.println("Number is Palindrome");
        } else
            System.out.println("Number is not Palindrome");
    }

}
