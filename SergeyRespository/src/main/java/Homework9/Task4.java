package Homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*Write the application to find the second largest value from given array.
Example:
Given array value: 3,2,8,9,1,5,4,3,7,8,5,9,9
Output: 8

         */
        int[] arr = {3,2,8,9,1,5,4,3,7,8,5,9,9};
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
