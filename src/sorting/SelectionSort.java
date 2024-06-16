package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) throws InterruptedException {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Display current state
            display(arr);
            Thread.sleep(500); // Pause for visualisation
        }

        // Print time complexity
        System.out.println("Time Complexity:");
        int comparisons = (n * (n - 1)) / 2; // Total comparisons in Selection Sort
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + (n - 1)); // Total swaps in Selection Sort

        // Print space complexity
        System.out.println("Space Complexity:");
        System.out.println("O(1)");
    }

    private static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
