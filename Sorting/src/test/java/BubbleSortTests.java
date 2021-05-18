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
}
