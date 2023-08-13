import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * A generic test class to run unit tests on Question_1.class
 */
public class Question_1Test {

    /**
     * Find duplicates : Functionality check
     */
    @Test
    public void testFindDuplicates() {
        List<String> inputList = new ArrayList<>(Arrays.asList(
                "apple", "dog", "balloon", "banana", "cat",
                "dog", "dog", "celery", "elephant", "elephant", "balloon"));

        Question_1 duplicateFinder = new Question_1(inputList);
        List<String> duplicates = duplicateFinder.findDuplicates();

        List<String> expectedDuplicates = new ArrayList<>(Arrays.asList("dog", "elephant", "balloon"));
        assertEquals(expectedDuplicates, duplicates);
    }

    /**
     * Find duplicates when unique elements are passed : Functionality check
     */
    @Test
    public void testNoDuplicates() {
        List<String> inputList = new ArrayList<>(Arrays.asList("apple", "banana", "cat"));

        Question_1 duplicateFinder = new Question_1(inputList);
        List<String> duplicates = duplicateFinder.findDuplicates();

        List<String> expectedDuplicates = new ArrayList<>();
        assertEquals(expectedDuplicates, duplicates);
    }


    /**
     * Find duplicates when all the elements passed are duplicate : Functionality check
     */
    @Test
    public void testOnlyDuplicates() {
        List<String> inputList = new ArrayList<>(Arrays.asList("apple", "apple", "apple"));

        Question_1 duplicateFinder = new Question_1(inputList);
        List<String> duplicates = duplicateFinder.findDuplicates();

        List<String> expectedDuplicates = new ArrayList<>(Arrays.asList("apple"));
        assertEquals(expectedDuplicates, duplicates);
    }
}
