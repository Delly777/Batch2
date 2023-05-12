package Homework7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    //Create one method takes one String Array and needs to return ArrayList with unique elements with
    // ascending from String Array. Input: [“java”, “phython”, “javascript”, “c++”, “java”, “c++”]
    // Returns new ArrayList —> [“c++”,“java”, “javascript”,“phython”]

    public static void main(String[] args) {

        String [] test =  {"java", "phython", "javascript", "c++", "java", "c++" };
        System.out.println(uniqueArrList(test));

    }

    public static ArrayList uniqueArrList (String []str){
        ArrayList <String> result = new ArrayList<>();
        Set<String> uniqueElements = new TreeSet<>();
        Collections.addAll(uniqueElements, str);
        result.addAll(uniqueElements);


        return result;
    }
}
