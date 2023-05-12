package class5;

import java.util.Arrays;

public class Task8 {
    //Create a method that takes int of arrays and returns reversed new int of arrays
    //Example :
    //Int [] arr = {10,20,30,40,50}
    //Output : 50, 40, 30, 20, 10

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int [] reversed = reverseArr(arr);
        System.out.println(Arrays.toString(reversed));
    }

    public static int[] reverseArr (int [] arr){
        int [] reversed = new int [arr.length];
        int index = 0;
        for (int i = arr.length-1; i >=0; i--){
            reversed [index] = arr[i];
            index++;
        }

        return reversed;
    }
}
