package class7Collections;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    //Create one method takes one String array. This method needs to return how many unique element you have in array.
    //Input: [“java”, “phython”, “javascript”, “c++”, “java”, “c++”]
    //Output: 4

    public static void main(String[] args) {
        String [] test =  {"java", "phython", "javascript", "c++", "java", "c++" };
        System.out.println(uniqueCount(test));
    }

    public static int uniqueCount (String [] str){
        Set <String> uniqueElements = new HashSet<>();
        for (String item : str){
            uniqueElements.add(item);
        }


        return uniqueElements.size();
    }
}
