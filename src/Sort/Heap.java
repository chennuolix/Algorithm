package Sort;

import Util.Swap;

import java.util.Scanner;

/**
 * Created by leixun on 16/9/14.
 */

public class Heap {
    public static void main(String[] args) {
        Heap instance = new Heap();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String input = in.nextLine();
            String[] inputArray = input.split(",");
            int[] numbers = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                numbers[i] = Integer.parseInt(inputArray[i]);
            }
            instance.BuildHeap(numbers, numbers.length);
            for (int k = numbers.length - 1 ; k > 0; k--) {
                Swap.ArraySwap(numbers, 0, k);
                //将剩下的数组，重新调整为大顶堆
                instance.BuildHeap(numbers, k);
            }
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println("");
        }
    }

    /**
     * 调整堆
     *
     * @param array
     * @param index
     */
    private void HeapAdjust(int[] array, int index, int size) {
        if (index < size / 2 ) {         //如果是叶节点 就不用调整了
            int lchild = index * 2 + 1;
            int rchild = index * 2 + 2;
            int max = index;
            if (lchild < size && array[max] < array[lchild]) {
                max = lchild;
            }
            if (rchild < size && array[max] < array[rchild]) {
                max = rchild;
            }
            if (max != index) {
                Swap.ArraySwap(array, index, max);
                HeapAdjust(array, max, size);        //避免调整之后的以max为父节点的子数不是堆
            }
        }
    }

    /**
     * 建立堆
     *
     * @param array
     */
    private void BuildHeap(int[] array, int size) {
        for (int i = size / 2 - 1; i >= 0; i--) {
            HeapAdjust(array, i, size);
        }
    }
}
