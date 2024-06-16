package cli;

import sorting.BubbleSort;
import sorting.SelectionSort;
import sorting.InsertionSort;
import sorting.MergeSort;
import sorting.QuickSort;
import searching.BinarySearch;
import searching.LinearSearch;
import searching.JumpSearch;
import searching.ExponentialSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get algorithm choice
        System.out.println("Choose an algorithm to visualize:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        System.out.println("6. Binary Search");
        System.out.println("7. Linear Search");
        System.out.println("8. Jump Search");
        System.out.println("9. Exponential Search");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 5) {
            // Get data set
            System.out.print("Enter the data set (comma-separated): ");
            String dataSetInput = scanner.next();
            int[] dataArray = Arrays.stream(dataSetInput.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            try {
                if (choice == 1) {
                    System.out.println("Visualizing Bubble Sort...");
                    BubbleSort.sort(dataArray);
                } else if (choice == 2) {
                    System.out.println("Visualizing Selection Sort...");
                    SelectionSort.sort(dataArray);
                } else if (choice == 3) {
                    System.out.println("Visualizing Insertion Sort...");
                    InsertionSort.sort(dataArray);
                } else if (choice == 4) {
                    System.out.println("Visualizing Merge Sort...");
                    MergeSort.sort(dataArray);
                } else if (choice == 5) {
                    System.out.println("Visualizing Quick Sort...");
                    QuickSort.sort(dataArray);
                }
            } catch (InterruptedException e) {
                System.out.println("Visualization interrupted");
            }
        } else if (choice >= 6 && choice <= 9) {
            // Get data set for search algorithms
            System.out.print("Enter the data set (comma-separated): ");
            String dataSetInput = scanner.next();
            int[] dataArray = Arrays.stream(dataSetInput.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            System.out.print("Enter the key to search for: ");
            int key = scanner.nextInt();

            try {
                if (choice == 6) {
                    System.out.println("Visualizing Binary Search...");
                    BinarySearch.binarySearch(dataArray, key);
                } else if (choice == 7) {
                    System.out.println("Visualizing Linear Search...");
                    LinearSearch.linearSearch(dataArray, key);
                } else if (choice == 8) {
                    System.out.println("Visualizing Jump Search...");
                    JumpSearch.jumpSearch(dataArray, key);
                } else if (choice == 9) {
                    System.out.println("Visualizing Exponential Search...");
                    ExponentialSearch.exponentialSearch(dataArray, key);
                }
            } catch (Exception e) {
                System.out.println("Visualization interrupted");
            }
        } else {
            System.out.println("Invalid choice");
        }
    }
}
