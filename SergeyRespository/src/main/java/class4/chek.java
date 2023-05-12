package class4;

import java.util.Arrays;

public class chek {
    public static void main(String[] args) {
        int []arr = {3,8,5,2,3,7,9,9};
        int count = 0;
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            System.out.println(isDuplicate + " ***");

            if (isDuplicate == false) {
                result[count++] = num;
            }

        }
        System.out.println(Arrays.toString(result));
    }
}
