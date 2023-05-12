package Homework4;

import java.util.Scanner;

public class Task2 {
    //Roller coaster
    //Write a program that determines if the user can ride a roller coaster.
    //To ride the roller coaster, you must be at least 120 cm tall. You must also
    //be at least 9 years old.
    //If you under 18 years old your ticket cost 7$ if you older 18 your ticket cost 12$.
    //Ask the user how tall and how old they are. Use a nested if statement to determine if they can ride the roller coaster.
    //If they can, print "Welcome aboard." and Ticket price
    //If they cannot, print "Sorry, you are not eligible to ride, you have to be at least 120 cm ".
    //If they cannot, print "Sorry, you are not eligible to ride you are too young "

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your height in cm ? ");
        int height = scanner.nextInt();
        System.out.println("What is your age? ");
        int age = scanner.nextInt();

        if (height>=120 && age>=9){
            System.out.println("Welcome aboard.");
            if(age<18){
                System.out.println("Ticket price - $7 ");
            }else {
                System.out.println("Ticket price - $12 ");
            }
        } else {
            if (height<120&& age<9){
                System.out.println("Too short and too young ");
            } else if (age < 9) {
                System.out.println("Sorry, you are not eligible to ride you are too young");

            }else {
                System.out.println("Sorry, you are not eligible to ride, you have to be at least 120 cm ");
            }
        }

    }
}
