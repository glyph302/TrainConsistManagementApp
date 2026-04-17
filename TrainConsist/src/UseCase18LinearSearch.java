/**
 * MAIN CLASS UseCase18LinearSearch
 * Use Case 18: Linear Search for Bogie ID
 * Description: Implements a sequential search to locate a specific bogie ID.
 * @version 18.0
 */
public class UseCase18LinearSearch {

    public static void main(String[] args) {
        System.out.println("=== UC18 Train Management: Linear Search ===");

        // 1. Unsorted list of Bogie IDs
        String[] bogieIds = {"B-105", "B-202", "B-909", "B-404", "B-707"};
        String targetId = "B-404";

        System.out.println("Searching for Bogie ID: " + targetId);

        // 2. Perform Linear Search
        int resultIndex = performLinearSearch(bogieIds, targetId);

        // 3. Display Results
        if (resultIndex != -1) {
            System.out.println("SUCCESS: Bogie " + targetId + " found at Position: " + (resultIndex + 1));
        } else {
            System.out.println("ERROR: Bogie ID " + targetId + " not found in the current consist.");
        }

        System.out.println("\nUC18 linear search completed successfully...");
    }

    /**
     * Logic for Linear Search
     * @return index of the element if found, otherwise -1
     */
    public static int performLinearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            // Sequential comparison
            if (arr[i].equalsIgnoreCase(target)) {
                return i; // Found! Return the current index
            }
        }
        return -1; // Target not found after full scan
    }
}