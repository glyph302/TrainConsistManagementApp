import java.util.*;

/**
 * MAIN CLASS UseCase7SortBogies
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 * Description: Ranks bogies based on their capacity for logistical planning.
 * @version 7.0
 */
public class UseCase7SortBogies {

    public static void main(String[] args) {
        System.out.println("=== UC7 Sort Bogies by Capacity ===");

        // 1. Setup the data (from UC6 logic)
        Map<String, Integer> capacityMap = new HashMap<>();
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair Car", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("General", 90);
        capacityMap.put("Pantry Car", 0);

        // 2. Convert Map entries to a List for sorting
        List<Map.Entry<String, Integer>> bogieList = new ArrayList<>(capacityMap.entrySet());

        // 3. Use a Comparator to sort by Value (Capacity) in Descending Order
        // (b2, b1) makes it Descending; (b1, b2) would be Ascending
        Collections.sort(bogieList, (b1, b2) -> b2.getValue().compareTo(b1.getValue()));

        // 4. Display the sorted results
        System.out.println("\nBogies Ranked by Capacity (High to Low):");
        System.out.println("-----------------------------------------");
        for (Map.Entry<String, Integer> entry : bogieList) {
            System.out.println(String.format("%-15s : %d seats", entry.getKey(), entry.getValue()));
        }

        System.out.println("\nUC7 custom sorting completed successfully...");
    }
}