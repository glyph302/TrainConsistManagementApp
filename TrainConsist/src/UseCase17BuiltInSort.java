import java.util.Arrays;

/**
 * MAIN CLASS UseCase17BuiltInSort
 * Use Case 17: Sort Bogie Names Alphabetically (Arrays.sort)
 * Description: Uses Java's optimized built-in sorting for production readiness.
 * @version 17.0
 */
public class UseCase17BuiltInSort {

    public static void main(String[] args) {
        System.out.println("=== UC17 Optimized Sorting: Arrays.sort() ===");

        // 1. Array of Bogie Names (Unsorted)
        String[] bogieNames = {
            "Sleeper", 
            "AC Chair Car", 
            "First Class", 
            "General", 
            "Pantry Car", 
            "Goods Wagon"
        };

        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        // 2. Using Java's built-in optimized Dual-Pivot Quicksort/Timsort
        Arrays.sort(bogieNames);

        // 3. Display Results
        System.out.println("After Alphabetical Sorting:");
        for (int i = 0; i < bogieNames.length; i++) {
            System.out.println((i + 1) + ". " + bogieNames[i]);
        }

        System.out.println("\nUC17 built-in sorting completed successfully...");
    }
}