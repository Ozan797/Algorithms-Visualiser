package searching;

public class BinarySearch {
    // Iterative implementation of Binary Search
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int comparisons = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            comparisons++;

            // Check if key is present at mid
            if (arr[mid] == key) {
                System.out.println("Key found at index: " + mid);
                System.out.println("Comparisons: " + comparisons);
                return mid;
            }

            // If key greater, ignore left half
            if (arr[mid] < key) {
                left = mid + 1;
            }
            // If key is smaller, ignore right half
            else {
                right = mid - 1;
            }

            // Display current state
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
