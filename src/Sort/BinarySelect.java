package Sort;

import java.util.Scanner;

/**
 * Created by leixun on 16/9/13.
 */
public class BinarySelect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String input = in.nextLine();
            String[] inputArray = input.split(",");
            int[] numbers = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                numbers[i] = Integer.parseInt(inputArray[i]);
            }
            int minIndex;
            int maxIndex;
            int swapNumber;
            boolean isMinSwap, isMaxSwap;
            for (int i = 0; i < numbers.length; i++) {
                if (i >= numbers.length - 1 - i) {
                    break;
                } else {
                    minIndex = i;
                    maxIndex = numbers.length - 1 - i;
                    isMaxSwap = false;
                    isMinSwap = false;
                    for (int n = i + 1; n < numbers.length - i; n++) {
                        if (numbers[minIndex] > numbers[n]) {
                            minIndex = n;
                            isMinSwap = true;
                        }
                        if (numbers[maxIndex] < numbers[n]) {
                            maxIndex = n;
                            isMaxSwap = true;
                        }
                    }
                    if (isMinSwap) {
                        swapNumber = numbers[i];
                        numbers[i] = numbers[minIndex];
                        numbers[minIndex] = swapNumber;
                    }
                    if (isMaxSwap) {
                        swapNumber = numbers[numbers.length - 1 - i];
                        numbers[numbers.length - 1 - i] = numbers[maxIndex];
                        numbers[maxIndex] = swapNumber;
                    }
                }
            }
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println("");
        }
    }
}
