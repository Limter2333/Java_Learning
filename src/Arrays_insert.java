import java.util.Arrays;

public class Arrays_insert {
    public static void main(String args[]) throws Exception {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -8, -9, 4};
        Arrays.sort(array);
        printArray("数组排序", array);
        int index = Arrays.binarySearch(array, 1);
        System.out.println("元素1 所在的位置（负数为不存在）：" + index);
        int newIndex = -index - 1;
        array = insertElement(array, 1, newIndex);
        printArray("数组添加元素1", array);
    }

    private static void printArray(String message, int array[]) {
        System.out.println(message + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static int[] insertElement(int original[], int element, int index) {
        int length = original.length;
        int destination[] = new int[length + 1];
        // 小于element的数
        System.arraycopy(original, 0, destination, 0, index);
        // 插入element
        destination[index] = element;
        // 插入大于element的数
        System.arraycopy(original, index, destination, index + 1, length - index);
        return destination;
    }
}
