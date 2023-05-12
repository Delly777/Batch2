package Homework5;

public class Task1 {

    // Create a method that takes an integer number and returns the factorial number of the parameter number
    //- Factorial number of 5 is that we need to multiply the number from 1 to 5 that means
    //5! = 5 x 4 x 3 x 2 x 1 = 120
    //Example : input number 6 Output : 720

    public static void main(String[] args) {
        System.out.println(factorialNumber(0));


    }

    public static int factorialNumber (int number){
        int result = 1;
        if (number<=0) {
            System.out.println("Please enter positive number");
        } else {
            for (int i = number; i >= 1; i--) {
                result *= i;
            }
        }
        return result;
    }
}
