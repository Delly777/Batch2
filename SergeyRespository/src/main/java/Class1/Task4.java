package Class1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* Write program will add up the value of a number of quarters, dimes, nickels, and pennies.
        The number of each type of coin is input by the user. The total value is printed in dollars.
        Example:
        Quarters: 5
        Dimes: 4
        Nickels: 3
        Pennies: 2
        The total in dollars is $1.82
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add count of Quarters: ");
        int quarters = scanner.nextInt();
        System.out.println("Please add count of Dimes: ");
        int dimes = scanner.nextInt();
        System.out.println("Please add count of Nickels: ");
        int nickels = scanner.nextInt();
        System.out.println("Please add count of Pennies: ");
        int pennies = scanner.nextInt();

        double quartersToPennies = quarters * 25;
        double dimesToPennies = dimes * 10;
        double nickelsToPennies = nickels *5;
        double totalInDol = (quartersToPennies + dimesToPennies + nickelsToPennies + pennies)/100;

        System.out.println("The total in dollars is $" + totalInDol);

    }
}
