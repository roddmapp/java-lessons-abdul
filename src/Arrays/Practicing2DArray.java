package Arrays;

public class Practicing2DArray {
    public static void main(String[] args) {
     /*
           .....     ...............
           | 0 | =>  | 1 |  2 | 3  |
     A=>   | 1 | =>  | 2 |  4 |  6 |
           | 2 | =>  | 3 |  5 |  9 |
           |,,,| =>  |,,,|,,,,|,,,,|
        */

        //3 different methods of intialising 2D arrays
        int[][] A = new int[5][5];
        int[][] B = {{1,2,2}, {2,4,6},{3,5,7}};
        int[][] C;
        C = new int[5][5];

        //this is valid and won't give us an error
        int[] D[] = new int[5][5];

        // Vaild declaration but means E is a 1D array and F is a 2D array
        int[] E, F[];
        E = new int[5];
        F = new int[3][3];

        //These are all 1D arrays except for J
        int[] G,H,I,J[];

        /**
         * Iterating through a 2D array using both for and for each loop
         */

        for (int i = 0; i< B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println();

        for (int x[]: B) {
            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println("");
        }

        /**
         * JAGGED ARRAYS
         */

        int[][] L;
        A = new int[3][];//creates 3 rows
        //create an array in each row with different size

        A[0]= new int[5];
        A[1]= new int[3];
        A[2]= new int[8];

        //printing a jagged array. NOTE: We are saying j < A[i] instead of j < A[0] because each array has a different size
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }






    }
}
