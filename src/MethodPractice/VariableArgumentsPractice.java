package MethodPractice;

public class VariableArgumentsPractice {

    static void showList(int start, String ...S) { //variable number of arguments. NOTE:: It should be added at the end fo the argument list
        for (int i = 0; i < S.length; i++) {
            System.out.println(start+". "+S[i]);
            start++;
        }
    }
    public static void main(String[] args) { //We can also write it as (String ...args)

        showList(2,"Rodney", "Bongi", "Adrian", "Tatenda");
    }
}
