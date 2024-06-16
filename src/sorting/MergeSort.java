package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] arr) throws InterruptedException {
        if (arr == null || arr.length == 0) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
        // Print space complexity
        System.out.println("Space Complexity:");
        System.out.println("O(n)");
    }

    private static void mergeSort(int[] arr, int left, int right) throws InterruptedException {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) throws InterruptedException {
        // Sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarray
        int k = left;

        // Merge the temporary arrays back into the original array
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
            // Display current state
            display(arr);
            Thread.sleep(500); // Pause for visualization
        }

        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
            // Display current state
            display(arr);
            Thread.sleep(500); // Pause for visualization
        }

        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
            // Display current state
            display(arr);
            Thread.sleep(500); // Pause for visualization
        }
    }

    private static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
