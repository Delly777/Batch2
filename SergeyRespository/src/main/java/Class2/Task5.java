package Class2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*Using a scanner enter three different ingredients for the product on the same line. Then ask the user to
        enter any int number. Change the first letter of the ingredients starting from the entered number. (Ingredients
        should start with different letters. Please read the example carefully ) Example 1:
        Please enter three ingredients with spaces:
        Milk Peanuts Butter
        Please enter the int number: 5
        The output is:
        5ilk 6eanuts 7utter
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three ingredients with spaces:");
        String ingredients = scanner.nextLine();
        System.out.println("Please enter the int number:");
        int number = scanner.nextInt();

        String word1 = ingredients.substring(0,ingredients.indexOf(" "));
        String word2 = ingredients.substring(ingredients.indexOf(" "),ingredients.lastIndexOf(" "));
        String word3 = ingredients.substring(ingredients.lastIndexOf(" "));
        String num1 = Integer.toString(number);
        String num2 = Integer.toString(number+1);
        String num3 = Integer.toString(number+2);

        System.out.println(num1 + word1.substring(1) + " " + num2 + word2.substring(2) + " " +
                num3 + word3.substring(2));
    }
}
