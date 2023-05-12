package Class3;

import java.util.Scanner;

public class Task7ThirdWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int sum;
        String str1,str2,str3;
        str1 = Integer.toString(num1);
        str2 = Integer.toString(num2);
        str3 = Integer.toString(num3);

        //to find first num

        for (int i=0;i<5;i++){
            if (str1.charAt(str1.length()-1)>=53){
                if(num1%10==0){
                    break;
                }
                num1++;
            }
            if (str1.charAt(str1.length()-1)<53){
                if(num1%10==0){
                    break;
                }
                num1--;
            }
        }
        //to find second num
        for (int i=0;i<5;i++){
            if (str2.charAt(str2.length()-1)>=53){
                if(num2%10==0){
                    break;
                }
                num2++;
            }
            if (str2.charAt(str2.length()-1)<53){
                if(num2%10==0){
                    break;
                }
                num2--;
            }
        }
        //to find third num
        for (int i=0;i<5;i++){
            if (str3.charAt(str3.length()-1)>=53){
                if(num3%10==0){
                    break;
                }
                num3++;
            }
            if (str3.charAt(str3.length()-1)<53){
                if(num3%10==0){
                    break;
                }
                num3--;
            }
        }
        sum=num1+num2+num3;
        System.out.println("sum is: " + sum);
    }
}
