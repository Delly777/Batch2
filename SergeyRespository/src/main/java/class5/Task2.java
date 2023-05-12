package class5;

public class Task2 {
    //Create a method that returns a number of times the string “code” appears anywhere in the given string,
    // we will accept any letter for the ‘d’ so “cope” and “cooe” count
    //Example : codeCount(“aaacodebbb”) -> 1 codeCount(“codexxcode”) -> 2 codeCount(“cozexxcope”) -> 2

    public static void main(String[] args) {
        System.out.println(codeCount("cozexxcope"));
    }

    public static int codeCount (String str){
        int result = 0;
        for (int i = 0; i<=str.length()-3; i++){
            if (str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e'){
                result++;
            }
        }
        return result;
    }
}
