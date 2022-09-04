package Arrays;

import java.util.Scanner;

public class InsertingAnElementChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you want to insert: ");
        int numberToinsert = sc.nextInt();

        System.out.println("Please enter the index you want to insert the element: ");
        int index = sc.nextInt();

        int A[] = new int[12];
        A[0]=12;
        A[1]=10;
        A[2]=3;
        A[3]=6;
        A[4]=23;
        A[5]=78;
        A[6]=9;
        A[7]=34;

        int n = 6;

        for (int i = n; i > index; i--)
            A[i]=A[i-1];
        A[index]=numberToinsert;


        for (int i = 0; i <n; i++)
            System.out.println(A[i] + ",");
        System.out.println("");


    }
}
