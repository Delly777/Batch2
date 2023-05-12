package Homework3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
/*Using a scanner enter a sentence that is not separated by space and each word starts with upper case.
Print given String as separated words with spaces.
Example:
Given Value: "IWantToLearnJava" Output: I Want To Learn Java Example-2:
Given Value: "ItIsSunnyOutside" Output: It Is Sunny Outside

 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type every word with UpperCase and no spaces between:");
        String str = scanner.nextLine();
        String result = "";
        for (int i = 0; i<str.length();i++){
            if(str.charAt(i)<65 || str.charAt(i)>90){ // if dec number of char not in the range of all UpperCase chars -
                result+=str.charAt(i);
            } else
                result+=" " + str.charAt(i); // add space before UpperCase char
        }
        System.out.println(result.strip()); // and strip() to delete space from begin and end of String
    }
}
