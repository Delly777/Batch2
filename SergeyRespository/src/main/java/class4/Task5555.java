package class4;


public class Task5555 {


        public static int[] removeDuplicates(int[] arr) {
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

                if (!isDuplicate) {
                    result[count++] = num;
                }
            }

            int[] finalResult = new int[count];
            for (int i = 0; i < count; i++) {
                finalResult[i] = result[i];
            }

            return finalResult;
        }
}
