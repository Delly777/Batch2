package Homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       /* Write a program that will accept 5 digits number and will print reversed number at the end.
        Example-1:
        53876
        The output is 67835 Example-2:
        97352
        The output is 25379
        */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversed=0;
        if (Integer.toString(number).length()==5){
            for (int i =0; i<5; i++){
                int digit = number%10 ;
                reversed = reversed*10 +digit;
                    number = number/10;
            }
            System.out.println(reversed);
        } else
            System.out.println("try again");

    }
}
