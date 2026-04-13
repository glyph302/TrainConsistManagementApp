import java.util.*;
import java.util.stream.Collectors;

/**
 * MAIN CLASS UseCase8FilterBogies
 * Use Case 8: Filter Passenger Bogies Using Streams
 * Description: Uses Stream API to select bogies meeting specific capacity criteria.
 * @version 8.0
 */
public class UseCase8FilterBogies {

    public static void main(String[] args) {
        System.out.println("=== UC8 Filter Bogies Using Streams ===");

        // 1. Initialize data
        Map<String, Integer> capacityMap = new HashMap<>();
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair Car", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("General", 90);
        capacityMap.put("Pantry Car", 0);

        System.out.println("Original Consist: " + capacityMap);

        // 2. Define business rule: Find "High Capacity" bogies (seats > 60)
        int capacityThreshold = 60;

        // 3. Use Stream API for filtering
        // .stream() -> starts the pipeline
        // .filter() -> applies the condition
        // .collect() -> converts the result back to a List/Map
        List<String> highCapacityBogies = capacityMap.entrySet().stream()
                .filter(entry -> entry.getValue() > capacityThreshold)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // 4. Display the filtered results
        System.out.println("\n--- Filtering Results ---");
        System.out.println("Criteria: Capacity > " + capacityThreshold + " seats");
        System.out.println("Eligible Bogies: " + highCapacityBogies);

        // 5. Example of multiple Stream operations: Counting non-empty bogies
        long activeBogieCount = capacityMap.values().stream()
                .filter(capacity -> capacity > 0)
                .count();

        System.out.println("\nTotal Passenger-ready Bogies: " + activeBogieCount);
        System.out.println("UC8 stream filtering completed successfully...");
    }
}