package class5;

public class Task4 {
    //Find if the given string in the method is a palindrome. Palindrome is word that has the same meaning
    // when reverted
    //Example words : civic, mom, abba, rotor, madam, refer return true or false

    public static void main(String[] args) {

        System.out.println(isPalindrome("Civic"));

    }

    public static Boolean isPalindrome (String str){
        boolean result = false;
        String reversed = "";
        for (int i = str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        if (str.equalsIgnoreCase(reversed)){
            result = true;
        }
        return result;
    }
}
