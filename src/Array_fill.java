import java.util.Arrays;

public class Array_fill {
    public static void main(String[] args) {
        int array[] = new int[6];
        Arrays.fill(array, 100);
        for (int i = 0, n = array.length; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        Arrays.fill(array, 3, 6, 50);
        for (int i = 0, n = array.length; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
