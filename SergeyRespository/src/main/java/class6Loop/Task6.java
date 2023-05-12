package class6Loop;

import java.util.Scanner;

public class Task6 {
    //Using a scanner enter the number of eggs in the box. Then ask the user, how many eggs are eaten at the end
    // of the day and keep asking the same question until your number of eggs is equaled to 0 in the box.
    //Example:
    //Input: 13
    //How many eggs did you eat today? 2
    //There are 11 eggs left
    //How many eggs did you eat today? 5
    //There are 6 eggs left
    //How many eggs did you eat today? 6
    //You have finished all the eggs

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of eggs: ");
        int eggs = scanner.nextInt();
        while (eggs >0){
            System.out.println( "How many eggs did you eat today? ");
            int x = scanner.nextInt();
            eggs-=x;
            if (eggs>0) {
                System.out.println("There are " + eggs + " eggs");
            } else {
                System.out.println("You have finished all the eggs");
            }
        }
    }
}
