package class4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        if(year%4 == 0 && year%100!=0 ){
            System.out.println("Leap year!");
        } else if (year%400 ==0) {
            System.out.println("Leap year!");
        } else {
            System.out.println("not leap year");
        }
    }
}
