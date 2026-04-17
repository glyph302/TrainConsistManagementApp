import java.util.Arrays;

/**
 * MAIN CLASS UseCase20DefensiveSearch
 * Use Case 20: Exception Handling During Search Operations
 * Description: Prevents search logic execution on empty data structures.
 * @version 20.0
 */
public class UseCase20DefensiveSearch {

    public static void main(String[] args) {
        System.out.println("=== UC20 Defensive Train Management ===");

        // Scenario A: Searching an empty consist
        String[] emptyConsist = {}; 
        try {
            System.out.println("\nAttempting search on empty consist...");
            performDefensiveSearch(emptyConsist, "B-101");
        } catch (IllegalStateException e) {
            System.err.println("ALARM: " + e.getMessage());
        }

        // Scenario B: Searching a valid consist
        String[] validConsist = {"B-101", "B-202", "B-303"};
        try {
            System.out.println("\nAttempting search on active consist...");
            int index = performDefensiveSearch(validConsist, "B-202");
            System.out.println("Bogie found at index: " + index);
        } catch (IllegalStateException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 defensive searching completed successfully...");
    }

    /**
     * Search method with defensive validation
     * @throws IllegalStateException if the array is empty
     */
    public static int performDefensiveSearch(String[] arr, String target) {
        // FAIL-FAST: Check if data exists before running O(n) or O(log n) logic
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Search Failed: No bogies found in the train formation!");
        }

        // Standard Linear Search if data is present
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) return i;
        }
        return -1;
    }
}