import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

/**
 * A generic test class which is used to test the functionality of the Question2.class (sorting of colors in the given order set)
 */
public class Question_2Test {

    /**
     * Sort a given list of random colors : Functionality check
     */
    @Test
    public void testColorSorting() {
        List<IColorable> colors = new ArrayList<>();
        colors.add(new ColorableObject("white"));
        colors.add(new ColorableObject("red"));
        colors.add(new ColorableObject("blue"));
        colors.add(new ColorableObject("white"));
        colors.add(new ColorableObject("red"));
        colors.add(new ColorableObject("blue"));
        colors.add(new ColorableObject("blue"));
        colors.add(new ColorableObject("red"));

        ColorSorter.sortColors(colors);

        String[] expected = {"red", "red", "red", "white", "white", "blue", "blue", "blue"};

        for (int i = 0; i < colors.size(); i++) {
            assertEquals(expected[i], colors.get(i).getColor());
        }
    }

    /**
     * Sort an empty list : Functionality check
     */
    @Test
    public void testEmptyList() {
        List<IColorable> colors = new ArrayList<>();
        ColorSorter.sortColors(colors);
        assertTrue(colors.isEmpty());
    }

    /**
     * Sort a list which contains only one color : Functionality check
     */
    @Test
    public void testSingleColor() {
        List<IColorable> colors = new ArrayList<>();
        colors.add(new ColorableObject("blue"));
        ColorSorter.sortColors(colors);
        assertEquals("blue", colors.get(0).getColor());
    }

    /**
     * Sort a list of colors which are already in sorted order : Functionality check
     */
    @Test
    public void testAlreadySortedColors() {
        List<IColorable> colors = new ArrayList<>();
        colors.add(new ColorableObject("red"));
        colors.add(new ColorableObject("white"));
        colors.add(new ColorableObject("blue"));
        ColorSorter.sortColors(colors);
        assertEquals("red", colors.get(0).getColor());
        assertEquals("white", colors.get(1).getColor());
        assertEquals("blue", colors.get(2).getColor());
    }
}
