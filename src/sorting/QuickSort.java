package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr) throws InterruptedException {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
        // Print space complexity
        System.out.println("Space Complexity:");
        System.out.println("O(log n)");
    }

    private static void quickSort(int[] arr, int low, int high) throws InterruptedException {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) throws InterruptedException {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element
        int comparisons = 0;
        int swaps = 0;

        for (int j = low; j < high; j++) {
            comparisons++;
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swaps++;
                // Display current state
                display(arr);
                Thread.sleep(500); // Pause for visualization
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        swaps++;
        // Display current state
        display(arr);
        Thread.sleep(500); // Pause for visualization

        // Print time complexity
        System.out.println("Time Complexity:");
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);

        return i + 1;
    }

    private static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
