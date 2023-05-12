package Homework2;

import java.util.Scanner;

public class AdditionalChanges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 6 digits number");
        while (true) {
            int number = scanner.nextInt();
            if (String.valueOf(number).length() != 6) {
                    System.out.println("please choose 6 digit number and try again");
            } else {
                int digit1 = number % 10, digit2 = (number / 10) % 10, digit3 = (number / 100) % 10, digit4 = (number / 1000) % 10,
                        digit5 = (number / 10000) % 10, digit6 = number / 100000;
                System.out.println(digit1 * digit2 * digit3 * digit4 * digit5 * digit6 + " multiplication");
                System.out.println(digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + " sum");
                break;
            }
        }
    }
}
