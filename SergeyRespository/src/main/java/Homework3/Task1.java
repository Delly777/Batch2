package Homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Reverse a given String and print it, if they have space in the beginning and at the end then remove it.
        Without using a slicing [ : :-1]. Try doing with for loop or while loop.
         Example: " Job" -> "boJ"
* " Happy " -> "yppaH"
* "Sun " -> "nuS"
* " Dream Job!" -> "!boJ maerD"
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("please type something you want ro reverse:");
        String anyString = scanner.nextLine().strip(); //strip() to remove spaces from beginning and end of String
        String reversed = "";

        for (int i =anyString.length()-1; i>=0; i-- ){
           reversed += anyString.charAt(i);
        }
        System.out.println(reversed);

    }
}
