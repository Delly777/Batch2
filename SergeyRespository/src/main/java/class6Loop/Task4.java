package class6Loop;

import java.util.Scanner;

public class Task4 {
    //Using the scanner ask the user to provide String value. Then replace all the char of the String with 'a'
    // using loop and print in every step.
    //For example: Input: Success Output: "auccess" "aaccess" “aaacess”
    //... “aaaaaaa”

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String str = scanner.nextLine();
        String result ="";
        String a = "a";
        for (int i = 1; i<str.length()+1;i++){

            result = a + str.substring(i,str.length());
            a +="a";
            System.out.println(result);

        }
    }
}
