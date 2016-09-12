package Sort;

import java.util.Scanner;

/**
 * Created by leixun on 16/9/12.
 */
public class Merge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Merge instance = new Merge();
        while (in.hasNext()) {
            String input = in.nextLine();
            String[] inputArray = input.split(",");
            int[] numbers = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                numbers[i] = Integer.parseInt(inputArray[i]);
            }
            int[] aux = new int[numbers.length];
            instance.Sort(numbers, aux, 0, numbers.length - 1);
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println("");
        }
    }

    private void Sort(int[] array, int[] aux, int lo, int hi) {
        if (lo >= hi)
            return;
        int mid = lo + (hi - lo) / 2;
        //对左边的数组递归排序
        Sort(array, aux, lo, mid);
        //对右边的数组递归排序
        Sort(array, aux, mid + 1, hi);
        //左右数组进行合并排序
        MergeArray(array, aux, lo, mid, hi);
    }

    private void MergeArray(int[] array, int[] aux, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = array[k];
        }
        for (int k = lo; k <= hi; k++) {
            //如果左边元素没了，直接将右边数组复制到剩余的数组中。
            if (i > mid) {
                array[k] = aux[j++];
            } else if (j > hi) {   //如果右边元素没有了，直接把左边数组复制到剩余的数组中
                array[k] = aux[i++];
            } else if (aux[i] < aux[j]) {   //左右数组比较，较小的元素放前面。
                array[k] = aux[i++];
            } else {
                array[k] = array[j++];
            }
        }
    }
}
