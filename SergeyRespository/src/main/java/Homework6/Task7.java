package Homework6;

import java.util.Scanner;

public class Task7 {
    //Using a scanner ask the user to input username and password. Create the two variables for the expected username
    // and password. if user input is not matching with the expected username and password ask the user again until
    // they are correct. (Optional: if you want to make it a little complicated. You can allow the user only three times
    // to enter the wrong username or password. if it is more than 3 times you can print “your account is on hold now.
    // Try after 5 min”)

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String expectedName = "JAVA";
        String expectedPassword = "12345";
        for (int i = 2; i>=0; i--){
            System.out.println("Enter username and password: ");
            String userName = scanner.nextLine();
            String password = scanner.nextLine();
            if (!userName.equals(expectedName) && !password.equals(expectedPassword)){
                if(i==0) {
                    System.out.println("Your account is on hold now. Try after 5 min");
                }else {
                    System.out.println("WRONG! Try again. \nTrials left: " + i );
                }

            } else {
                System.out.println("Welcome! you are logged in");
                break;
            }

        }

    }
}
