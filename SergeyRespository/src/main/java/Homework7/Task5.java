package Homework7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Task5 {
    //Create one method takes String Arraylist with duplicate values, this method need to return array
    // with descending order of unique element from arrayList.
    //Input: [“java”, “phython”, “javascript”, “c++”, “java”, “c++”]
    //Returns new String[]—> {“phython”, “javascript”, “java”, “c++”}

    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        test.add("java"); test.add("phyton"); test.add("javascript"); test.add("c++"); test.add("java"); test.add("c++");
        String [] arr = uniqueArrDes(test);
        System.out.println(Arrays.toString(arr));

    }

    public static String [] uniqueArrDes (ArrayList<String> list){
        TreeSet<String> unique = new TreeSet<>();
        unique.addAll(list);

        String [] result = new String[unique.size()];
        int i = unique.size()-1;
        for (String item : unique){
            result[i]=item;
            i--;
        }

        return result;
    }
}
