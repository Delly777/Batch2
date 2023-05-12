package Class3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
       /* Using the scanner ask the user to enter one string value and print only unique letters combined as String
       also without any space in the beginning and at the end.
        Example -1 :
        Given Value: "i am happy"
        Output: i am hpy
        Example-2:
        Given Value: " contribute"
        Output: contribue
        Example-3:
        Given Value: " i want cup of coffee " Output: i want cup of e
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please type something:");
        String str = scanner.nextLine().strip(); // strip() to delete spaces from begin and the end of String
        String result = "";


        for (int i=0; i<str.length(); i++){
            String ch = Character.toString(str.charAt(i)); // convert every next char as String to use in contains method
            if (result.contains(ch) && str.charAt(i)!=' '){
                continue; // if this char is already in the string and it s not a space we just skip and go to the next
            } else
            result+=str.charAt(i);
        }
        System.out.println(result);

    }
}
