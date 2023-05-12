package Class3;

import java.util.Scanner;

public class Task7 {
    /*For this problem ask user to enter three numbers.
Round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5,
so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values.
Ex:1
Input1: 16
Input2: 17
Input3: 18
Output→ 60
round_sum(12, 13, 14) → 30 round_sum(6, 4, 4) → 10
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();


        int plus1 = num1, minus1 = num1;
        for (int i = 1; i<10; i++){ //increase or decrease value of input number until it % 10 = 0;
                plus1++; //if increased number gets result faster, then last number was greater than 5
                minus1--; // if decreased number gets faster, then last number was less than 5,  and we save both
                if (plus1%10==0 || minus1%10 ==0){
                    System.out.println(plus1 + " " + minus1);
                    break;
                }
        }
        int plus2 = num2, minus2 = num2; // same with input number 2
        for (int i =1; i<10; i++){
            plus2++;
            minus2--;
            if (plus2%10==0 || minus2%10 ==0){
                System.out.println(plus2 + " " + minus2);
                break;
            }
        }
        int plus3 = num3, minus3 = num3; // same with number 3
        for (int i =1; i<10; i++){
            plus3++;
            minus3--;
            if (plus3%10==0 || minus3%10 ==0){
                System.out.println(plus3 + " " + minus3);
                break;
            }
        }
            if (plus1%10==0 && minus1%10 ==0){ //if both %10 = 0 -> number ending with 5, assign greater number
                num1 = plus1;
            } else if (plus1%10 ==0){
                num1=plus1;
            }else {
                num1=minus1;
            }
        if (plus2%10==0 && minus2%10 ==0){ // same with number 2
            num2 = plus2;
        } else if (plus2%10 ==0){
            num2=plus2;
        }else {
            num2=minus2;
        }
        if (plus3%10==0 && minus3%10 ==0){ // same with number 3
            num3 = plus3;
        } else if (plus3%10 ==0){
            num3=plus3;
        }else {
            num3=minus3;
        }
        int sum = num1+num2+num3;
        System.out.println("sum is " + sum);

    }
}
