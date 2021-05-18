import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTests {
    private QuickSort quickSort;
    @BeforeEach
    void setUp() {
        this.quickSort = new QuickSort();
    }

    @Test
    void InputIsEmpty_shouldReturnsEmptyArray() {
        List<Integer> list = new ArrayList<>();
        quickSort.quicksort(list);
        assertTrue(list.isEmpty());
    }

    @Test
    void InputOnlyContainsOneElement_shouldReturnOriginalList() {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        quickSort.quicksort(list);
        assertEquals(1, list.size());
        assertEquals(7, list.get(0));
    }

    @Test
    void InputContainsMultipleElements_shouldReturnSortedList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(6,3,8,4,7));
        List<Integer> expected = new ArrayList<>(Arrays.asList(3,4,6,7,8));
        quickSort.quicksort(list);
        assertEquals(expected, list);
    }
}
