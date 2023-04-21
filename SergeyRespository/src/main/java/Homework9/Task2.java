package Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Using Scanner ask user to provide any string value and index number from the array.
          Using for loop update value from array.
Example:
[ Liam, Emma, Noah, Olivia, William ] Please enter String:
Lucas
Please enter index number:
3
Output:
[ Liam, Emma, Noah, Lucas, William ]

         */
        String [] names = {"Liam", "Emma", "Noah", "Olivia", "William"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter index number: ");
        int index = scanner.nextInt();
        names[index] = "Lucas"; // why I need use for loop for this one line code ?
        System.out.println(Arrays.toString(names));

    }
}
