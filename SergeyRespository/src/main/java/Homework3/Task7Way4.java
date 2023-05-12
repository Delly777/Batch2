package Homework3;

import java.util.Scanner;

public class Task7Way4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int sum;

        //to find first num

        for (int i=0;i<5;i++){ //we need max 5 rounds
            if (num1%10>=5){ // to find last digit of number we need num%10, if 5+ increase by 1 until get 0
                num1++;
            }
            if (num1%10<5){  // if less than 5 decrease by 1 until we get 0
                if(num1%10==0){ // break if 0;
                    break;
                }
                num1--;
            }
        }
        //to find second num
        for (int i=0;i<5;i++){
            if (num2%10>=5){
                num2++;
            }
            if (num2%10<5){
                if(num2%10==0){
                    break;
                }
                num2--;
            }
        }
        //to find third num
        for (int i=0;i<5;i++){
            if (num3%10>=5){
                num3++;
            }
            if (num3%10<5){
                if(num3%10==0){
                    break;
                }
                num3--;
            }
        }
        sum=num1+num2+num3;
        System.out.println(num1 + " " + num2 + " " + num3 );
        System.out.println("sum is: " + sum);
    }
}
