package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class StackTest {
    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    @DisplayName("Should return true when empty")
    void shouldRtnTrueWhenEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("Should return the new node pushed to stack")
    void shouldRtnTheNewNode() {
        int expected = 4;
        stack.push(4);
        int actual = stack.peek();
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Should return the top node")
    void shouldRtnTopNode() {
        int expected = 9;
        stack.push(7);
        stack.push(8);
        stack.push(9);
        int actual = stack.peek();
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Should remove and return the top node")
    void shouldRemoveAndRtnTopNode() {
        int expected = 5;
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int actual = stack.remove();
        assertEquals(expected, actual);
    }

}
