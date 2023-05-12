package Homework2;

public class Task3 {
    public static void main(String[] args) {
       /* Please use method chaining for the following Strings. Methods are provided next to the String.
                String “ Snicker “; —> trim, toUpperCase, substring and charAt methods
        String “Cookie” —> toLowerCase, replace ‘o’ with ‘u’, concat with ’s’, starts with ‘C’
        */

        String str1 = " Snicker ";
        str1.trim().toUpperCase().substring(0,3).charAt(0); // return int
        String str2 = "Cookie";
        str2.toLowerCase().replace('o','u').concat("s").startsWith("C"); // return boolean

    }
}
