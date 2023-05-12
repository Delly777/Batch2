package Homework3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*Ask the user to enter one in number between 1 and 10 then, Write the program to print the string in the
        following format:
Search to see what happens when you multiply the string with numbers and use it for solving this question.
Example: Input: 6 Output:
666666
55555
4444
333
22
1
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number from 1 to 10");
        while(true) {
            int num = scanner.nextInt();
            if (num <2 || num>9){
                System.out.println("please enter number from 1 to 10");
            }else {
                int begin = num;
                for (int i = 0; i < num; i++) {
                    String result = "";
                    for (int k = 0; k < begin; k++) {
                        result += begin;
                    }
                    begin--;

                    System.out.println(result);
                }
                break;
            }
        }
    }
}
