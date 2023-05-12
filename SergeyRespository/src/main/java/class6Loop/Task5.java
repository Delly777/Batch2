package class6Loop;

import java.util.Scanner;

public class Task5 {
    //The user using a scanner enters the current speed and target speed . In every 1-sec car's speed will
    // increase 10mil. Please find the total number of sec to reach your target speed using a while loop.
    //Example:
    //CurrentSpeed: 6
    //Target Speed: 20
    //Output: You need 2 sec to reach target speed.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter current speed and target speed: ");
        double x = scanner.nextInt();
        double y = scanner.nextInt();

        double result = (y-x) /10; // this should be correct answer
        System.out.println(result);

        //but this what they want me to do

        int secCounter = 0;

        while (x<20){
            x+=10;
            secCounter++;
        }
        System.out.println("You need " + secCounter + " sec to reach target speed.");

    }
}
