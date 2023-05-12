package Homework4;

import java.util.Arrays;

public class Task5way3 {
    ////1. Create count, to track length
    //    //2. For loop it
    //    //3. If we didn't met this number before, add 1 to our count, if we met it, just skip it
    //    //For Example:
    //    //{3,6,8,3,2,7,9,9} -->return [3, 6, 8, 2, 7, 9]
    //    // {-1,5,8,-1,-55,55,0}--> return [-1, 5, 8, -55, 55, 0]

    public static void main(String[] args) {

        int [] arr = {3,6,8,3,2,7,9,9};
        String resultStr = "";
        int arrSize = 0;
        for (int i = 0; i<arr.length; i++){
            int counter = 0;
            for (int z = 0; z<arr.length;z++){
                if(i>z && arr[i] == arr[z]){
                    counter++;
                }
            }
            if (counter==0){
                resultStr+=arr[i]+"";
                arrSize++;
            }
        }
        System.out.println(resultStr);
        int [] resultArr = new int[arrSize];
        for (int i = 0; i<resultStr.length(); i++){
            resultArr[i]= Integer.parseInt(resultStr.charAt(i)+"");
        }

        System.out.println(Arrays.toString(resultArr));
    }
}
