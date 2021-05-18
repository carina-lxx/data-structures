import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class BubbleSortTests {

    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    void InputIsEmpty_shouldReturn() {
        int[] array = {};
        bubbleSort.bubblesort(array);
        assertEquals(0, array.length);
    }

    @Test
    void InputContainsOneElement_shouldReturn() {
        int[] array = {4};
        bubbleSort.bubblesort(array);
        assertEquals(1, array.length);
        assertEquals(4, array[0]);
    }
}
