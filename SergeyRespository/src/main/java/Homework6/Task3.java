package Homework6;

import java.util.Scanner;

public class Task3 {
    //Using scanner ask user to provide the string value. Print "dad" if the given string contains the
    // "dad", but where the middle 'a' char can be any char.
    //Example:
    //Input the year: testdadtest Output :dad
    //Input the year: testd7dtest Output :dad
    //Input the year: testdodtest Output :dad
    //Input the year: testDudtest Output :dad

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type any text: ");
        String str = scanner.nextLine();
        for (int i =0; i<str.length()-2; i++){  // -2 in condition to avoid out of bond error
            if (str.charAt(i) =='d' && str.charAt(i+2) == 'd'){
                System.out.println("dad");
                break; // use break to print "dad" only one time even if condition matches a few times
            }
        }
    }
}
