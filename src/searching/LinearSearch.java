package searching;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        int comparisons = 0;

        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == key) {
                System.out.println("Key found at index: " + i);
                System.out.println("Comparisons: " + comparisons);
                return i;
            }
            display(arr, i);
        }

        System.out.println("Key not found");
        System.out.println("Comparisons: " + comparisons);
        return -1;
    }

    private static void display(int[] arr, int index) {
        System.out.print("Current index: " + index + ", Current element: " + arr[index] + "\n");
    }
}
