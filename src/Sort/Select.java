package Sort;

import java.util.Scanner;

/**
 * Created by leixun on 16/9/12.
 */
public class Select {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Insert instance = new Insert();
        while (in.hasNext()) {
            String input = in.nextLine();
            String[] inputArray = input.split(",");
            int[] numbers = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                numbers[i] = Integer.parseInt(inputArray[i]);
            }
            int minIndex;
            int swapNumber;
            boolean isSwap;
            for (int i = 0; i < numbers.length - 1; i++) {
                isSwap = false;
                minIndex = i;
                for (int n = i + 1; n < numbers.length; n++) {
                    if (numbers[n] < numbers[minIndex]) {
                        minIndex = n;
                        isSwap = true;
                    }
                }
                if (isSwap) {
                    swapNumber = numbers[minIndex];
                    numbers[minIndex] = numbers[i];
                    numbers[i] = swapNumber;
                }
            }
            for (int number:numbers) {
                System.out.print(number + " ");
            }
            System.out.println("");
        }
    }
}
