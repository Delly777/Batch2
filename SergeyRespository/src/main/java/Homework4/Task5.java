package Homework4;

import java.util.Arrays;

public class Task5 {
    //1. Create count, to track length
    //2. For loop it
    //3. If we didn't met this number before, add 1 to our count, if we met it, just skip it
    //For Example:
    //{3,6,8,3,2,7,9,9} -->return [3, 6, 8, 2, 7, 9]
    // {-1,5,8,-1,-55,55,0}--> return [-1, 5, 8, -55, 55, 0]

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 3, 2, 7, 9, 9};
        int[] arr2 = {-1,5,8,-1,-55,55,0};
        uniqueNumbers(arr);

    }

    public static int[] uniqueNumbers(int[] numbers) {
        int[] uniqueValue = new int[numbers.length];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            for (int z = 0; z < numbers.length; z++) {
                if (z > i && numbers[i] == numbers[z]) {
                    count++;

                    uniqueValue[i] = numbers[i];
                }
                if (i!=z && numbers[i]==numbers[z]){
                    isDuplicate =true;
                }
            }
            if (!isDuplicate) {
                uniqueValue[i] = numbers[i];
                count++;
            }
        }

        int[] finalResult = new int[count];
        int index = 0;
        for (int j : uniqueValue) {
            if (j != 0) {
                finalResult[index++] = j;
            }
        }
        System.out.println(Arrays.toString(finalResult));

            return finalResult;

    }
}
