package Sort;

import java.util.Scanner;

/**
 * Created by leixun on 16/9/13.
 */
public class ShellInsert {
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

        }
    }
}
