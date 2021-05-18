import java.util.List;

import static java.util.Collections.swap;


public class QuickSort {
    private QuickSort quickSort;

    public static void quicksort(List<Integer> array) {
        quicksort(array, 0, array.size()-1);
    }

    private static void quicksort(List<Integer> array, int left, int right) {
        if(left >= right) {
            return;
        }
        int pivot = array.get((left + right) / 2);
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index-1);
        quicksort(array, index, right);
    }
    public static int partition(List<Integer> array, int left, int right, int pivot) {
        while(left <= right) {
            while(array.get(left) < pivot) {
                left++;
            }
            while(array.get(right) > pivot) {
                right--;
            }
            if(left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
}
