package Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class QueueTest {
    private Queue queue;

    @BeforeEach
    void setup() {
        queue = new Queue();
    }

    @Test
    @DisplayName("return true or false to test whether it's an empty queue")
    void checkQueueIsEmpty() {
        boolean actual = queue.isEmpty();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Should add a new node to the queue")
    void checkNodeAddedToQueue() {
        int expected = 6;
        queue.add(8);
        queue.add(6);
        int actual = queue.getTail();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Shoudl return the front node but not remove it")
    void peekShouldRtnFrontNode() {
        int expected = 1;
        queue.add(1);
        queue.add(2);
        queue.add(3);
        int actual = queue.peek();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Shoudl return the front node but not remove it")
    void peekShouldMoveAndRtnFrontNode() throws Exception {
        int expected = 9;
        queue.add(9);
        queue.add(8);
        queue.add(7);
        int actual = queue.remove();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should throw exception when calling remove if queue is empty")
    void removeShouldThrowExceptionWhenQueueIsEmpty() {
        assertThrows(Exception.class, () -> {
            queue.remove();
        });
    }


}
