package Patterns;

public class Patterns3 {
    public static void main(String[] args) {

        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
            * * * * *
              * * * *
                * * *
                  * *
                    *          */

        System.out.println("***********FIRST PATTERN***************");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (j >= i) {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
                        *
                      * *
                    * * *
                  * * * *
                * * * * *
         */

        System.out.println("***********SECOND PATTERN***************");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (i+j >5) { //if we add the values of i and j we see that we print * when their sum is greater than the size
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
                        *
                      * * *
                    * * * * *
                  * * * * * * *
                * * * * * * * * *
         */

        System.out.println("***********THIRD PATTERN***************");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (i+j >5) { //if we add the values of i and j we see that we print * when their sum is greater than the size
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }

            for (int k = 2; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*Expected Output
        The values of i are going down(changing rows) and the values of j are going linearly across(changing columns)
                        *
                      * * *
                    * * * * *
                  * * * * * * *
                * * * * * * * * *
                  * * * * * * *
                    * * * * *
                      * * *
                        *
         */

        System.out.println("***********FOURTH PATTERN***************");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (i+j >5) { //if we add the values of i and j we see that we print * when their sum is greater than the size
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }

            for (int k = 2; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (j>=i) { //if we add the values of i and j we see that we print * when their sum is greater than the size
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }

            for (int k = 1; k <= 4-i+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
