package StrindandRegularExpressions;

public class StringAndRegularExpressionsExercises {

    public static void main(String[] args) {
        String str = "programmer@gmail.com";

        //checking if it matches the word gmail
        System.out.println(str.matches(".*gmail.*"));
        System.out.println(str.matches("\\w+@{1}gmail.{1}\\w{3}"));

        //getting the username and the domain got the given email address
        System.out.println(str.substring(0, str.indexOf('@')));
        System.out.println(str.substring(str.indexOf('@') + 1));

        int i = str.indexOf("@");
        String uname = str.substring(0,i);
        String domain = str.substring(i+1, str.length());

        System.out.println("Username: " + uname);
        System.out.println("Domain: " + domain);

        System.out.println(domain.startsWith("gmail"));
        
        /**
         * CHECK IF A NUMBER IS BINARY OR NOT
         */
        int b = 10000110;
        String str1 = String.valueOf(b);

        System.out.println(str1.matches("[01]*"));

        /**
         * CHECK IF A NUMBER IS HEXADECIMAL OR NOT
         */
        String str3 = "9AF";

        System.out.println(str3.matches("[0-9A-F]*"));

        /**
         * CHECK IF DATE IS IN DATE FORMAT (dd/mm/yyyy)
         */

        String d = "01/02/2022";

        System.out.println(d.matches("\\d{2}/\\d{2}/\\d{4}"));

        /**
         * REMOVE SPECIAL CHARACTERS FROM A STRING
         */

        String str4 = "a|B@c#1$2%3";

        System.out.println(str4.replaceAll("\\W", ""));

        //Alternative solution
        System.out.println(str4.replaceAll("[^a-zA-Z0-9]", ""));

        /**
         * REMOVE EXTRA SPACES FROM A STRING
         */

        String str5 = "aB CD  FDH 123 88";

        System.out.println(str5.replaceAll("\\s+", ""));

        //If the are multiple trailing and leading spaces on a String
        String str6 = "   cde 76454 ght oiuy AFHeed     ";

        //we can use trim() to remove the keading and trailing spaces
        System.out.println(str6.replaceAll("\\s+", "").trim());

        /**
         * COUNTING THE NUMBER OF WORDS IN A STRING
         */

        String str7 = "    abc def gh abg 234    ";

        //remove spaces and any leading or trailing spaces note we are using " " instead of ""
        str7 = str7.replaceAll("\\s+", " ").trim();

        String[] words = str7.split("\\s");

        System.out.println(words.length);

    }

}
