import java.util.HashMap;
import java.util.Map;

/**
 * MAIN CLASS UseCase6BogieCapacity
 * Use Case 6: Map Bogie to Capacity (HashMap)
 * Description: Links bogie types to their respective seating/load capacities.
 * @version 6.0
 */
public class UseCase6BogieCapacity {

    public static void main(String[] args) {
        System.out.println("=== UC6 Bogie Capacity Mapping ===");
        System.out.println("==================================\n");

        // HashMap: Key = Bogie Type (String), Value = Capacity (Integer)
        Map<String, Integer> capacityMap = new HashMap<>();

        // 1. Populating the Map with Operational Data
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair Car", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Goods (General)", 1000); // 1000 units of cargo
        capacityMap.put("Pantry Car", 0);         // No passenger seats

        // 2. Displaying all mappings
        System.out.println("Registered Bogie Capacities:");
        for (String bogie : capacityMap.keySet()) {
            System.out.println(bogie + " -> Capacity: " + capacityMap.get(bogie));
        }

        // 3. Retrieval and Calculation
        String searchType = "AC Chair Car";
        if (capacityMap.containsKey(searchType)) {
            System.out.println("\nRetrieving data for: " + searchType);
            System.out.println("Current Capacity Limit: " + capacityMap.get(searchType));
        }

        System.out.println("\nUC6 capacity mapping completed successfully...");
    }
}