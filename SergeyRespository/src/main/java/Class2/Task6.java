package Class2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /* Write the program to get the string value from the specified position. First, ask the user to enter one
        String value. Then ask the user to the enter starting number and ending number. After that, print the value
between the given starting and ending numbers. (Note: since the user does not know the java, the user starts counting
from 1, and the ending number will be included)
Example:
Please enter the String value: Definition of Science
Please enter the starting number: 2
Please enter the ending number 5
The output is:
efin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the String value:");
        String str = scanner.nextLine();
        while (true) {
            System.out.println("Please enter the starting number:");
            int num1 = scanner.nextInt();
            System.out.println("Please enter the ending number:");
            int num2 = scanner.nextInt();
            if(num1 >= str.length() || num2 >= str.length()){
                System.out.println("try again");
            }else {
                System.out.println(str.substring(num1 - 1, num2));
                break;
            }
        }
    }
}
