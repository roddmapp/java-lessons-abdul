package MethodPractice;

public class SumUsingCommandLine {
    public static void main(String[] args) {
        double s = 0;

        for (String x: args) {
            if (x.matches("[0-9\\.]+"))//check if it's a number or not
                s = s + Double.parseDouble(x);
            else
                System.out.println("Please enter a digit. This is not a number.");
        }
        System.out.println("Sum is "+ s);
    }
}
