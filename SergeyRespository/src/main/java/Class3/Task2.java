package Class3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Using the scanner asks the user to input the min and max number. Write a java code that will calculate the sum
         of numbers between the range of min and max and those that can only be divided by 3 and 11.
        (min and max numbers are included) Example:
        0, 120 -> 33 + 66 + 99 = 198
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter min and max number:");
        int number1 = scanner.nextInt(), number2 = scanner.nextInt(), sum=0;
       for (int i = number1; i <=number2; i++){
           number1+=1;
           if(number1%3 ==0 && number1%11 ==0){
               sum+=number1;
           }
       }
        System.out.println("here is the sum: " + sum);

    }
}
