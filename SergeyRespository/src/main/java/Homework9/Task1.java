package Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Create the int array with given numbers 10,4,3,55,32,145,443,234,98,32
       Using scanner ask user to provide any number from given array, then remove the value from array
       and put 0 instead of that.
Example:
Given Number:
234
Output:
10, 4, 3, 55, 32, 145, 443, 0, 98, 32

         */
        int [] numbers = {10,4,3,55,32,145,443,234,98,32};
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(numbers) + "\nPlease enter number from array: ");
        int providedNumber = scanner.nextInt();
        for(int i = 0; i<numbers.length;i++){
            if(numbers[i]==providedNumber){
                numbers[i]=0;
            }
        }
        System.out.println(Arrays.toString(numbers));


    }

}
