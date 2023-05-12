package class7Collections;

import java.util.TreeSet;

public class Task1 {
    //Create one method takes one int array. This methods need to print all unique elements from array ascending order.
    //Input: [2,3,4,4,7,2,1]
    //Output: 1, 2, 3, 4, 7

    public static void main(String[] args) {

        int [] test = {2,3,4,4,7,2,1};

        uniqueElement(test);

    }

    public static void uniqueElement (int []arr){
        TreeSet<Integer> result = new TreeSet<>();
        for (int item : arr){
            result.add(item);
        }
        System.out.println(result);
    }
}
