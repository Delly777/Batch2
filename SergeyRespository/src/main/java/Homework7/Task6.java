package Homework7;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task6 {
    //A bigram is any two adjacent words in the text disregarding case and punctuation.
    // A histogram is the count of how many times that particular bigram occurred in the text.
    // Write the method will take String and it will return the map with count of particular bigram occurred in the text.
    //Example:
    //Given the text:
    //“The quick brown fox and the quick blue hare.” The bigrams with their counts would be. Output:
    //“the quick” 2
    //“quick brown” 1
    //“brown fox” 1
    //“fox and” 1
    //“and the” 1
    //“quick blue” 1
    //“blue hare” 1

    public static void main(String[] args) {
        String str = "The quick brown fox and the quick blue hare.";

        System.out.println(bigramCounter(str));

    }

    public static Map<String, Integer> bigramCounter (String str){
        LinkedHashMap<String,Integer> result = new LinkedHashMap<>();
        String [] arr = str.split(" ");
        for (int i =0; i< arr.length-1; i++){
            int count = 0;
            for (int z = 0; z<arr.length-1; z++){
                if((arr[i]+arr[i+1]).equalsIgnoreCase(arr[z]+arr[z+1])){
                    count++;
                }
            }

            result.put((arr[i]+" " + arr[i+1]).toLowerCase(),count);
        }


        return result;

    }
}
