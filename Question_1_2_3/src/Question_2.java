import java.util.List;
import java.util.ArrayList;

/**
 * An interface to define a custom datatype
 */
interface IColorable {
    String getColor();
    void setColor(String color);
}

/**
 * A class implementing a custom data type with the required functionality
 */
class ColorableObject implements IColorable {
    private String color;

    public ColorableObject(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}

/**
 * A generic class which has the functionality of sorting the list of colors in the given order set.
 */
class ColorSorter {
    public static void sortColors(List<IColorable> colorables) {
        int low = 0;
        int mid = 0;
        int high = colorables.size() - 1;

        while (mid <= high) {
            switch (colorables.get(mid).getColor()) {
                case "red":
                    swap(colorables, low, mid);
                    low++;
                    mid++;
                    break;

                case "white":
                    mid++;
                    break;

                case "blue":
                    swap(colorables, mid, high);
                    high--;
                    break;
            }
        }
    }

    /**
     * Swap 2 elements
     * @param colorables refers to list of colors
     * @param i refers to an index
     * @param j refers to an index
     */
    private static void swap(List<IColorable> colorables, int i, int j) {
        IColorable temp = colorables.get(i);
        colorables.set(i, colorables.get(j));
        colorables.set(j, temp);
    }
}

/**
 * Main driver which is used to call the required functions
 */
public class Question_2 {
    public static void main(String[] args) {
        List<IColorable> colours = new ArrayList<>();
        colours.add(new ColorableObject("white"));
        colours.add(new ColorableObject("red"));
        colours.add(new ColorableObject("blue"));
        colours.add(new ColorableObject("white"));
        colours.add(new ColorableObject("red"));
        colours.add(new ColorableObject("blue"));
        colours.add(new ColorableObject("blue"));
        colours.add(new ColorableObject("red"));

        ColorSorter.sortColors(colours);

        for (IColorable colorable : colours) {
            System.out.println(colorable.getColor());
        }
    }
}
