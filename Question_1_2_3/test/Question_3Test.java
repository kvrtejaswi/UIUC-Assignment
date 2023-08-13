import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A generic test class for running the unit test cases on Question2.class
 */
public class Question_3Test {

    /**
     * Pop element from empty stack : Functionality check
     */
    @Test
    public void testPopEmptyStack() {
        Question_3<Integer> stack = new Question_3<>();
        assertNull(stack.pop());
    }

    /**
     * Pop element from an non-empty stack : Functionality check
     */
    @Test
    public void testPopNonEmptyStack() {
        Question_3<String> stack = new Question_3<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");

        assertEquals("third", stack.pop());
        assertEquals("second", stack.pop());
        assertEquals("first", stack.pop());
        assertNull(stack.pop());
    }

    /**
     * Test to check if empty stack - Functionality check
     */
    @Test
    public void testIsEmpty() {
        Question_3<Double> stack = new Question_3<>();
        assertTrue(stack.isEmpty());

        stack.push(1.0);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }
}
