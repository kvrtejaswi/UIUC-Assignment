import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A generic class to find the duplicate elements present in a given list and print it
 */
public class Question_1 {

    private List<String> inputList;

    /**
     * Parameterized constructor which accepts and assigns the list of data
     * @param inputList contains data/values
     */
    public Question_1(List<String> inputList) {
        this.inputList = inputList;
    }

    /**
     * Find duplicate elements present in the given list
     * @return a list of duplicate items
     */
    public List<String> findDuplicates() {
        Map<String, Integer> countMap = new HashMap<>();
        List<String> duplicates = new ArrayList<>();

        for (String item : inputList) {
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
            if (countMap.get(item) == 2) {
                duplicates.add(item);
            }
        }

        return duplicates;
    }

    /**
     * Main method where the required methods are called
     * @param args default
     */
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("dog");
        inputList.add("balloon");
        inputList.add("banana");
        inputList.add("cat");
        inputList.add("dog");
        inputList.add("dog");
        inputList.add("celery");
        inputList.add("elephant");
        inputList.add("elephant");
        inputList.add("balloon");

        Question_1 duplicateFinder = new Question_1(inputList);
        List<String> duplicates = duplicateFinder.findDuplicates();

        System.out.println("Duplicates: " + duplicates);
    }
}
