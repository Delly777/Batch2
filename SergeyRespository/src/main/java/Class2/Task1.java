package Class2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       /* 1. Write a program that will accept only 6 digits numbers like 578432 and find multiplication (5*7*8*4*3*2)
       of all digits and sum (5+7+8+4+3+2)of all digits.
       Example 1:
        578432
        Multiplication of all digits is 6720 The Sum of all digits is 29
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 6 digits number");
  for (int trial = 0; trial<3; trial++) {
      int number = scanner.nextInt();
      if (String.valueOf(number).length() != 6) {
          if (trial==2){
              System.out.println("bye!");
          } else
          System.out.println("please choose 6 digit number and try again");
      } else {
          int digit1 = number % 10, digit2 = (number / 10) % 10, digit3 = (number / 100) % 10, digit4 = (number / 1000) % 10,
                  digit5 = (number / 10000) % 10, digit6 = number / 100000;
          System.out.println(digit1 * digit2 * digit3 * digit4 * digit5 * digit6 + " multiplication");
          System.out.println(digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + " sum");
          break;
      }
  }

        // way #2
       /* if (Integer.toString(number).length()!=6){
            System.out.println("please choose 6 digit number and try again");
        }
        */
    }
}
