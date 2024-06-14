package cli;

import sorting.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get algorithm choice
        System.out.println("Choose an algorithm to visualize:");
        System.out.println("1. Bubble Sort");
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
                System.out.println("Visualizing Bubble Sort...");
                BubbleSort.sort(dataArray);
                BubbleSort.printTimeComplexity();
                BubbleSort.printSpaceComplexity();
            } else {
                System.out.println("Invalid choice");
            }
        } catch (InterruptedException e) {
            System.out.println("Visualization interrupted");
        }
    }
}
