package class5;

public class Task6 {
    //Find the maximum number in the integer of the arrays
    //Example :
    //Int [] num = {10, 20, 40, 80}
    //Output : 80

    public static void main(String[] args) {

        int [] num = {50,20,80,30};

        for (int i=0;i< num.length-1;i++){
            if (num[i]>num[i+1]){
                num[i+1] = num[i];
            }
        }

        System.out.println(num[num.length-1]); // the largest number will be last number in array


    }
}
