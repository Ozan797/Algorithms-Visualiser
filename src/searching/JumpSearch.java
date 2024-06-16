package searching;

public class JumpSearch {
    public static int jumpSearch(int[] arr, int key) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;
        int comparisons = 0;

        while (arr[Math.min(step, n) - 1] < key) {
            comparisons++;
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                System.out.println("Key not found");
                System.out.println("Comparisons: " + comparisons);
                return -1;
            }
            display(arr, prev, Math.min(step, n) - 1);
        }

        while (arr[prev] < key) {
            comparisons++;
            prev++;
            if (prev == Math.min(step, n)) {
                System.out.println("Key not found");
                System.out.println("Comparisons: " + comparisons);
                return -1;
            }
            display(arr, prev, prev);
        }

        comparisons++;
        if (arr[prev] == key) {
            System.out.println("Key found at index: " + prev);
            System.out.println("Comparisons: " + comparisons);
            return prev;
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
