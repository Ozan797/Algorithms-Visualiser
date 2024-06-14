package cli;

import sorting.BubbleSort;
import sorting.SelectionSort;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get algorithm choice
        System.out.println("Choose an algorithm to visualize:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        // Get data set
        System.out.print("Enter the data set (comma-separated): ");
        String dataSetInput = scanner.next();
        int[] dataArray = Arrays.stream(dataSetInput.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        try {
            if (choice == 1) {
                System.out.println("Visualising Bubble Sort...");
                BubbleSort.sort(dataArray);
                BubbleSort.printTimeComplexity();
                BubbleSort.printSpaceComplexity();
            } else if (choice == 2) {
                System.out.println("Visualising Selection Sort...");
                SelectionSort.sort(dataArray);
            } else {
                System.out.println("Invalid choice");
            }
        } catch (InterruptedException e) {
            System.out.println("Visualization interrupted");
        }
    }
}
