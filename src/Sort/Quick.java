package Sort;

import java.util.Scanner;

/**
 * Created by leixun on 16/9/12.
 */
public class Quick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Quick instance = new Quick();
        while (in.hasNext()) {
            String input = in.nextLine();
            String[] inputArray = input.split(",");
            int[] numbers = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                numbers[i] = Integer.parseInt(inputArray[i]);
            }
            int pivot;
            for (int i = 0; i < numbers.length; i++) {
                pivot = numbers[i];

            }
        }
    }

    private void moveWithPivot(int[] array,int lo){
        int storeIndex = lo;
        for (int k = lo;k<array.length;k++) {
        }
    }
}
