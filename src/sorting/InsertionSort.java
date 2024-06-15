package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr) throws InterruptedException {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                comparisons++; // Count comparison
                arr[j + 1] = arr[j];
                j = j - 1;
                swaps++; // Count swap
                // Display current state
                display(arr);
                Thread.sleep(500); // Pause for visualization
            }
            arr[j + 1] = key;
            // Display current state after inserting key
            display(arr);
            Thread.sleep(500); // Pause for visualization
        }

        // Print time complexity
        System.out.println("Time Complexity:");
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);

        // Print space complexity
        System.out.println("Space Complexity:");
        System.out.println("O(1)");
    }

    private static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
