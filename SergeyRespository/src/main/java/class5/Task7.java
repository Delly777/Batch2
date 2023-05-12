package class5;

public class Task7 {
    //Find duplicate strings in a string object
    //Example :
    //String str = “I’m am am learning java java”
    //Output:
    //THIS ARE DUPLICATES : am
    //THIS ARE DUPLICATES : java

    public static void main(String[] args) {
        duplicateFinder("I’m am am learning java java");
    }

    public static void duplicateFinder (String str){
        String [] arr = str.split(" ");
        for (int i = 0; i<arr.length; i++){
            for (int z = 0; z< arr.length; z++){
                if(i>z && arr[z].equalsIgnoreCase(arr[i])){
                    System.out.println("THIS AREE DUPLICATES : " + arr[i]);
                }
            }
        }
    }

}
