package Sort;

import Util.Swap;

import java.util.Scanner;

/**
 * Created by leixun on 16/9/14.
 */
public class Bubble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String input = in.nextLine();
            String[] inputArray = input.split(",");
            int[] numbers = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                numbers[i] = Integer.parseInt(inputArray[i]);
            }
            boolean isChange = false;
            for (int k = numbers.length - 1; k >= 0; k--) {
                for (int i = 0; i < k; i++) {
                    if (numbers[i] > numbers[i + 1]) {
                        Swap.ArraySwap(numbers, i, i + 1);
                        isChange = true;
                    }
                }
                if (!isChange){
                    break;
                }
            }
        }
    }
}
