import java.util.Arrays;

/**
 * MAIN CLASS UseCase16ManualSort
 * Use Case 16: Sort Passenger Bogies (Bubble Sort)
 * Description: Manually sorts bogie capacities without using built-in library methods.
 * @version 16.0
 */
public class UseCase16ManualSort {

    public static void main(String[] args) {
        System.out.println("=== UC16 Manual Sorting: Bubble Sort Algorithm ===");

        // 1. Initial unsorted capacities
        int[] capacities = {72, 24, 90, 56, 12};
        System.out.println("Initial Capacities: " + Arrays.toString(capacities));

        // 2. Perform Bubble Sort
        bubbleSort(capacities);

        // 3. Display Sorted Results
        System.out.println("Sorted Capacities (Ascending): " + Arrays.toString(capacities));
        System.out.println("\nUC16 manual sorting completed successfully...");
    }

    /**
     * Logic for Bubble Sort
     * Compares adjacent elements and swaps them if they are in the wrong order.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap operation
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }
}