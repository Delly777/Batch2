package Homework5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    //Fibonacci series is a series where the next term is the sum of the previous two terms
    //Fibonacci Series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    //Create a method that print the fibonacci series

    public static void main(String[] args) {
        fibonacciSeries();
    }

    public static void fibonacciSeries(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers as starting point");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ArrayList list = new ArrayList<Integer>();
        list.add(a); list.add(b);
        for (int i = 2; i< 10; i++){
            list.add((int) list.get(i-2) + (int) list.get(i-1));
        }
        System.out.println(list);
    }
}
