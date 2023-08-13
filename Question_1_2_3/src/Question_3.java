import java.util.Stack;


/**
 * A generic class to represent a stack data structure with any given data type
 * @param <T> : Type of an element it stores
 */
public class Question_3<T> {

    private Stack<T> stack;

    /**
     * Constructor which initializes an empty stack
     */
    public Question_3() {
        stack = new Stack<>();
    }

    /**
     * Pushes an element into the stack
     * @param item : Input item which should be on the stack
     */
    public void push(T item) {
        stack.push(item);
    }

    /**
     * Pops/removes the top element from the stack
     * @return the top element from the stack
     */
    public T pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null; // Return null or throw an exception to handle underflow - Default EmptyStackException will be thrown
    }

    /**
     * Check if the stack is empty or not
     * @return true if stack is empty, else false
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Main method where the required methods are called
     * @param args default
     */
    public static void main(String args[]){
        Question_3<Integer> stack = new Question_3<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}

