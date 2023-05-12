package Class3;

import java.util.Scanner;

public class Task7SecondWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int sum;
        String str1,str2,str3,str4;
        str1 = Integer.toString(num1);
        str2 = Integer.toString(num2);
        str3 = Integer.toString(num3);
        str4 = Integer.toString(num4);

        //let's find first number
        if(str1.charAt(str1.length()-1)>=53){ // if last char in range from 5 to 9 increase number by 1 until %10 = 0
            for (int i=0;i < 5; i++){
                if (num1%10==0){
                    break;
                }
                num1++;
            }

        }
        if (str1.charAt(str1.length()-1)<53){ // if last char in range from 0 to 4 decrease number by 1 until %10 = 0
            for (int i=0;i < 5; i++){ //if it's already 0 it will break the statement with no changes
                if (num1%10==0){
                    break;
                }
                num1--;
            }
        }
        //let's find second number
        if(str2.charAt(str2.length()-1)>=53){
            for (int i=0;i < 5; i++){
                if (num2%10==0){
                    break;
                }
                num2++;
            }

        }
        if (str2.charAt(str2.length()-1)<53){
            for (int i=0;i < 5; i++){
                if (num2%10==0){
                    break;
                }
                num2--;
            }
        }
        //and repeat to find 3rd number
        if(str3.charAt(str3.length()-1)>=53){
            for (int i=0;i < 5; i++){
                if (num3%10==0){
                    break;
                }
                num3++;
            }

        }
        if (str3.charAt(str3.length()-1)<53){
            for (int i=0;i < 5; i++){
                if (num3%10==0){
                    break;
                }
                num3--;
            }
        }
        for (int i=0;i<5;i++){
            if (str4.charAt(str4.length()-1)>=53){
                if(num4%10==0){
                    break;
                }
                num4++;
            }
            if (str4.charAt(str4.length()-1)<53){
                if(num4%10==0){
                    break;
                }
                num4--;
            }
        }
        //to find sum
        sum = num1+num2+num3;
        System.out.println("sum of closest round numbers is: " + sum);
        System.out.println(num4);
    }
}
