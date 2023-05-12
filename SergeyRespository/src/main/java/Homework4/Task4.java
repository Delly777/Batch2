package Homework4;

import java.util.Arrays;

public class Task4 {
    //Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion.
    //* Your method should switch the order of the first two values,
    //* then switch the order of the next two, switch the order of the next two, and so on.
    //For Example:
    //1. {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
    //2. {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to",
    //"hamlet"}
    public static void main(String[] args) {
        String [] str1 = {"four", "score", "and", "seven", "years", "ago"};
        switchedPairs(str1);
        String []str2 ={"to", "be", "or", "not", "to", "be", "hamlet"};
        switchedPairs(str2);


    }

    public static String [] switchedPairs (String[] arr){
        String [] result = new String[arr.length];
        for (int i = 0; i<arr.length;i++){
            if (i % 2 == 0){
                if(arr.length%2!=0 && i== arr.length-1){
                    result[i]=arr[i];
                } else {
                    result[i] = arr[i + 1];
                }
            }else {
                result[i]=arr[i-1];
            }

        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
