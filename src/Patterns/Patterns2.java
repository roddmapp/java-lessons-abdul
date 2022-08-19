package Patterns;

public class Patterns2 {
    public static void main(String[] args) {

        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5  */

        System.out.println("***********FIRST PATTERN***************");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " "); //printing the value of i
            }
            System.out.println();
        }
    }
}
