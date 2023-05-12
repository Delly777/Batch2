package Homework4;

import java.util.Scanner;

public class Task1 {
    //Write a program that works out whether if a given number is an odd or even number.
    //Ask user to enter any number and respond to user is given number odd or even.
    //Example: user input is 66 This is even number Example: user input is 87 This is odd number.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = scanner.nextInt();
        if(number%2 == 0){
            System.out.println(number + " - is even number!");
        } else {
            System.out.println(number + " - is odd number!");
        }


    }
}
