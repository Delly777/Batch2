package Homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Write a Java program that reads a number in inches, converts it to meters.
     Note: One inch is 0.0254 meter.
     Test Data
     INCH: 2000
     Expected Output :
     2000.0 inch is 50.8 meters
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add value in inches to convert into meters:");
        double inch = scanner.nextDouble();
        double result = inch* 0.0254;
        System.out.println(inch + " inch is " + result + " meters");
    }
}
