package Homework9;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


    /*Create one int array with size of 10 without any value. Using scanner ask user to provide the int value until
    you filled out the array with given numbers. Then print the array with all numbers.
    Int [] numbers=new int[10];
Example:
Please enter the int number. You have 10 space in array:
11
Please enter the int number. You have 9 space in array:
43
Please enter the int number. You have 8 space in array:
77
 keep continue to ask user until you don't have any space in the array.

     */

        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        int spaces = 10, index =0;
        while (index<10) {
            System.out.println("Please enter the int number. You have " +spaces+ " space in array:");
            arr[index]= scanner.nextInt();
            index++; spaces--;

        }
        System.out.println(Arrays.toString(arr));

    }
}
