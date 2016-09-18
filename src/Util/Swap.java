package Util;

/**
 * Created by leixun on 16/9/14.
 */
public class Swap {


    public static void ArraySwap(int[] array, int srcIndex, int tarIndex) {
        int swap;
        swap = array[srcIndex];
        array[srcIndex] = array[tarIndex];
        array[tarIndex] = swap;
    }

}
