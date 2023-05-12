package class7Collections;

import java.util.TreeSet;

public class Task2 {
    //Create one method takes one int array. This methods needs to print all unique element from array in
    // descending order.
    //Input: [2,3,4,4,7,2,1]
    //Output: 7, 4, 3, 2, 1

    public static void main(String[] args) {

        int [] test = {2,3,4,4,7,2,1};

        uniqueDescending(test);

    }

    public static void uniqueDescending (int []arr){
        TreeSet<Integer> result = new TreeSet<>();
        for (int item : arr){
            result.add(item);
        }
        System.out.println(result.descendingSet());
    }
}
