package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) throws InterruptedException {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                // Display current state
                display(arr);
                Thread.sleep(500); // Pause for visualization
            }
            if (!swapped) break;
        }
    }

    private static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printTimeComplexity() {
        System.out.println("Time Complexity:");
        System.out.println("Best Case: O(n)");
        System.out.println("Average Case: O(n^2)");
        System.out.println("Worst Case: O(n^2)");
    }

    public static void printSpaceComplexity() {
        System.out.println("Space Complexity:");
        System.out.println("O(1)");
    }
}
