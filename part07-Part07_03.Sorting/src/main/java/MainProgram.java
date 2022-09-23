
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        // write your code here
        if (array.length == 0) {
            return -1;
        }

        int idx = 0;
        int min = array[idx];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[idx]) {
                min = array[i];
                idx = i;
            }
        }
        return array[idx];
    }

    public static int indexOfSmallest(int[] array) {

        // add this
        if (array.length == 0) {
            return -1;
        }

        int idx = 0;
        int min = array[idx];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                idx = i;
            }
        }
        return idx;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here

        if (table.length == 0) {
            return -1;
        }

        int idx = startIndex;
        int min = table[idx];

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= min) {
                min = table[i];
                idx = i;
            }
        }
        return idx;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp1Idx = array[index1];
        int temp2Idx = array[index2];
        array[index1] = temp2Idx;
        array[index2] = temp1Idx;

    }

    public static void sort(int[] array) {
        int iter = 0;
        while (iter < array.length) {
            System.out.println(Arrays.toString(array));
            swap(array, indexOfSmallestFrom(array, iter), iter);
            iter +=1;
        }
    }

}
