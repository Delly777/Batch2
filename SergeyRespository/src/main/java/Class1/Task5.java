package Class1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /* I need to write a program that will take a given amount of money and return the number of dollars
        in quarters, dimes, nickels, and pennies that make up that given amount
        Example 1:
        Please enter your balance:
        2.36
        $2.36 will make 9 quarters 1 dime 0 nickels and 1 pennies
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your balance: ");
        double balance = scanner.nextDouble();
        int balanceInPennies = (int) (balance*100);
        int quarters = balanceInPennies/25;
        int dime = balanceInPennies%25 / 10;
        int nickels = (balanceInPennies%25)%10 / 5;
        int pennies = ((balanceInPennies%25)%10)%5;

        System.out.println("$"+balance + " will make " + quarters + " quarters " + dime + " dime " + nickels +
                " nickels " + pennies + " pennies");

    }
}
