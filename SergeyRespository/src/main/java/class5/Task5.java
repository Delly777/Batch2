package class5;

import java.util.Arrays;

public class Task5 {

    //Iterate first number of the integer arrays followed by the last number
    //Example :
    //Int [] arr {10,20,30,40,50,60,70,80}
    //Output : [10, 80, 20, 70, 30, 60, 40, 50]

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80,90};
        firstLastOrder(arr);

    }

    public static void firstLastOrder (int [] arr){
        int [] result = new int[arr.length];
        int counter = 1;
        int counter2 = 0;
        for( int i = 0; i<arr.length; i++){
            if (i%2!=0){
                result[i]=arr[arr.length-counter];
                counter++;
            } else {
                result[i] = arr[counter2];
                counter2++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
