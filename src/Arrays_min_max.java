import java.util.Arrays;
import java.util.Collections;

public class Arrays_min_max {
    public static void main(String[] args) {
        Integer[] numbers = {9, 7, 8, 1, 4, 3, 6};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
