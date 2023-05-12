package Class1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Write a Java program to convert minutes into a number of years and days.
        Test Data
        Input the number of minutes: 3456789
        Expected Output :
        3456789 minutes is approximately 6 years and 210 days
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter number of minutes to convert into years and days:");
        int min = scanner.nextInt();
        int days = min/(60*24);
        int years = days/365;
        int daysLeft = days%365;
        System.out.println(min + " minutes is approximately " + years + " years and " + daysLeft + " days" );


    }
}
