package searching;

public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int key) {
        int n = arr.length;
        if (arr[0] == key) {
            System.out.println("Key found at index: 0");
            System.out.println("Comparisons: 1");
            return 0;
        }

        int comparisons = 1;
        int i = 1;
        while (i < n && arr[i] <= key) {
            comparisons++;
            i *= 2;
            display(arr, i / 2, Math.min(i, n - 1));
        }

        int result = binarySearch(arr, i / 2, Math.min(i, n), key, comparisons);
        return result;
    }

    private static int binarySearch(int[] arr, int left, int right, int key, int comparisons) {
        while (left <= right) {
            comparisons++;
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                System.out.println("Key found at index: " + mid);
                System.out.println("Comparisons: " + comparisons);
                return mid;
            }

            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            display(arr, left, right);
        }

        System.out.println("Key not found");
        System.out.println("Comparisons: " + comparisons);
        return -1;
    }

    private static void display(int[] arr, int left, int right) {
        System.out.print("Current search range: ");
        for (int i = left; i <= right; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
