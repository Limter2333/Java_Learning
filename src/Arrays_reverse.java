public class Arrays_reverse {
    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static int[] reverse(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("反转前数组是:");
        printArray(arr);
        System.out.println("\n");
        System.out.println("反转后数组是:");
        printArray(reverse(arr, arr.length));
    }
}
