package QuickSort;

import java.util.Arrays;

public class QuickSort {
    static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high); //3
            //3 = partition(0,7)
            // partition(0,2) = 2
            //partition(0,1) = 1

            quickSort(array, low, pivotIndex - 1); //quickSort(array,0,2)

            quickSort(array, pivotIndex + 1, high);
        }
    }
    public static void main(String args[]) {

        int[] data = { 12,11,0,8,5,23,6};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        QuickSort.quickSort(data, 0, size - 1);

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(data));
    }
}

// Main class


