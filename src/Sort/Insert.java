package Sort;

import java.util.Scanner;

/**
 * Created by leixun on 16/9/12.
 */
public class Insert {
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
            int currentNumber;
            //数组长度为1或0
            if (numbers.length <= 1) {
                System.out.println(numbers[0]);
                return;
            }
            for (int i = 1; i < numbers.length; i++) {
                currentNumber = numbers[i];
                //n是将要插入的位置
                for (int n = i - 1; n >= 0; n--) {
                    if (numbers[n] > currentNumber) {
                        instance.moveToRight(numbers, n);
                    } else {
                        numbers[n + 1] = currentNumber;
                        break;
                    }
                }
            }
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println("");
        }
    }

    private void moveToRight(int[] array, int currentItem) {
        array[currentItem + 1] = array[currentItem];
    }
}
