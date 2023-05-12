package Homework6;

import java.util.Scanner;

public class Task2 {
    //Using a scanner ask the user to provide starting and ending numbers. Print the numbers
    // divisible by 3 and 5 between given number AND print count of those numbers which is divisible by 3 and 5.
    //EXAMPLE:
    //First number: 5
    //Second number: 65
    //Output:
    //15
    //30
    //45
    //60
    //Total number that divisible by 3 and 5 is 4.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide starting and ending numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int count = 0;
        for(int i =x; i<=y; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total number that divisible by 3 and 5 is "+count);
    }
}
