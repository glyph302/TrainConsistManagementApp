import java.util.*;

/**
 * MAIN CLASS UseCase10TotalCapacity
 * Use Case 10: Count Total Seats in Train (reduce)
 * Description: Aggregates individual bogie capacities into a total train capacity.
 * @version 10.0
 */
public class UseCase10TotalCapacity {

    public static void main(String[] args) {
        System.out.println("=== UC10 Total Train Capacity Aggregation ===");

        // 1. Data Source: List of seating capacities for the current consist
        List<Integer> capacities = Arrays.asList(72, 72, 56, 56, 24, 90);

        System.out.println("Bogie Capacities in Consist: " + capacities);

        // 2. Using reduce() to sum all capacities
        // 0 is the identity (starting value)
        // (a, b) -> a + b is the accumulator (adding the next capacity to the sum)
        int totalSeats = capacities.stream()
                .reduce(0, (sum, capacity) -> sum + capacity);

        // 3. Alternatively, using the specialized sum() method for IntStreams
        int totalSeatsQuick = capacities.stream()
                .mapToInt(Integer::intValue)
                .sum();

        // 4. Display the aggregate results
        System.out.println("\n--- Operational Summary ---");
        System.out.println("Total Passenger Capacity: " + totalSeats + " seats");
        System.out.println("Estimated Ticket Availability: " + totalSeats);

        // 5. Business Logic Check
        if (totalSeats > 300) {
            System.out.println("Status: High-Capacity Consist Verified.");
        }

        System.out.println("\nUC10 capacity aggregation completed successfully...");
    }
}