import java.util.Arrays;

/**
 * MAIN CLASS UseCase19BinarySearch
 * Use Case 19: Binary Search for Bogie ID
 * Description: Implements an optimized O(log n) search on sorted data.
 * @version 19.0
 */
public class UseCase19BinarySearch {

    public static void main(String[] args) {
        System.out.println("=== UC19 Optimized Search: Binary Search ===");

        // 1. Unsorted list of Bogie IDs
        String[] bogieIds = {"B-909", "B-105", "B-707", "B-202", "B-404"};
        String targetId = "B-707";

        // 2. CRITICAL STEP: Data must be sorted for Binary Search to work
        Arrays.sort(bogieIds);
        System.out.println("Sorted Consist for Searching: " + Arrays.toString(bogieIds));

        // 3. Perform Binary Search
        int resultIndex = performBinarySearch(bogieIds, targetId);

        // 4. Display Results
        if (resultIndex != -1) {
            System.out.println("SUCCESS: Bogie " + targetId + " found at Sorted Position: " + (resultIndex + 1));
        } else {
            System.out.println("ERROR: Bogie ID " + targetId + " not found.");
        }

        System.out.println("\nUC19 binary search completed successfully...");
    }

    /**
     * Manual Binary Search Implementation
     * Strategy: Divide and Conquer
     */
    public static int performBinarySearch(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = target.compareTo(arr[mid]);

            // Check if target is at mid
            if (comparison == 0) return mid;

            // If target is greater, ignore left half
            if (comparison > 0) {
                left = mid + 1;
            } 
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }
}