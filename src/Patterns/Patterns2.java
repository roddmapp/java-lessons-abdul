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

        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15  */

        System.out.println("***********SECOND PATTERN***************");
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count + " "); //printing the value of i
            }
            System.out.println();
        }

        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
            *
            * *
            * * *
            * * * *
            * * * * *  */

        System.out.println("***********THIRD PATTERN***************");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* "); //printing the value of i
            }
            System.out.println();
        }

        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1  */

        System.out.println("***********FOURTH PATTERN***************");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i+1; j++) {

                System.out.print(j+ " "); //printing the value of i
            }
            System.out.println();
        }

        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
            * * * * *
            * * * *
            * * *
            * *
            *          */

        System.out.println("***********FIFTH PATTERN***************");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i+1; j++) {

                System.out.print("* "); //printing the value of i
            }
            System.out.println();
        }
    }
}
