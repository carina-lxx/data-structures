import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTests {
    private MergeSort mergeSort;

    @BeforeEach
    void setUp() {
        mergeSort = new MergeSort();
    }

    @Test
    void whenInputIsEmpty_shouldReturnEmptyArray() {
        int[] array = new int[0];
        mergeSort.mergesort(array);
        assertArrayEquals(new int[0], array);
    }

    @Test
    void InputContainsOnlyElement_shouldReturnOriginalArray() {
        int[] array = new int[1];
        array[0] = 5;
        mergeSort.mergesort(array);
        assertEquals(1, array.length);
        assertEquals(5, array[0]);
    }
    @Test
    void InputContainsMultipleElement_shouldReturnOriginalArray() {
        int[] actual = {9,2,5,8,3,4,};
        int[] expected = {2,3,4,5,8,9};
        mergeSort.mergesort(actual);
        assertArrayEquals(expected, actual);
    }
}
