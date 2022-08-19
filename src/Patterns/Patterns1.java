package Patterns;

public class Patterns1 {
    public static void main(String[] args) {

        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5   */

        System.out.println("***********FIRST PATTERN***************");
        //Patterns Solution
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " "); //printing the value of j only
            }
            System.out.println("");
        }

        System.out.println(); //just to have space between this program and next
        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
            1 1 1 1 1
            2 2 2 2 2
            3 3 3 3 3
            4 4 4 4 4
            5 5 5 5 5  */
        System.out.println("***********SECOND PATTERN***************");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i+ " "); //printing the value of i only
            }
            System.out.println();
        }


        System.out.println(); //just to have space between this program and next
        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
            2 3 4 5 6
            3 4 5 6 7
            4 5 6 7 8
            5 6 7 8 9
            6 7 8 9 10  */

        System.out.println("***********THIRD PATTERN***************");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i+j + " "); //printing the value of i+j
            }
            System.out.println();
        }


        System.out.println(); //just to have space between this program and next
        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
            1 2 3 4 5
            6 7 8 9 10
            11 12 13 14 15
            16 17 18 19 20
            21 22 23 24 25  */

        System.out.println("***********FOURTH PATTERN***************");
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                count++;
                System.out.format("%02d ",count); //printing the value count incremented
            }
            System.out.println();
        }
    }
}
