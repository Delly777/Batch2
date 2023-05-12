package Homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* Using the scanner asks the user to enter one sentence with three words and print the index number of each
        word's last character and then print the sum of each index number that you found.
        For Example:
        Input:
        "Importance of Human" --> it can be any three-word sentence.
                Output:
        9 --> index number of 'e' 12 --> index number of 'f' 18 --> index number of 'n' The sum: 39
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 words");
        String str = scanner.nextLine();
        int index1 = str.indexOf(" ")-1;
        int index2 = str.lastIndexOf(" ") -1;
        int index3 = str.length()-1;
        System.out.println("Index of '"+ str.charAt(str.indexOf(" ")-1) + "' is "  + index1 +
                "\nIndex of '" + str.charAt(str.lastIndexOf(" ") -1) + "' is " + index2 +
                "\nIndex of '" + str.charAt(str.length()-1) + "' is " + index3 +
                "\nThe sum: " + (index1+index2+index3));

    }
}
