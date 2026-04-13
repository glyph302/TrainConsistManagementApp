import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS UseCase2PassengerBogies
 * Use Case 2: Add Passenger Bogies to Train (ArrayList Operations)
 * Description: Demonstrates dynamic list manipulation (add, remove, contains).
 * @version 2.0
 */
public class UseCase2PassengerBogies {

    public static void main(String[] args) {
        System.out.println("=== UC2 Add Passenger Bogies to Train ===");

        // Initialize the list
        List<String> passengerBogies = new ArrayList<>();

        // 1. Adding Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // 2. Removing a specific bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // 3. Checking for existence
        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper?: " + hasSleeper);

        // Final Summary
        System.out.println("\nFinal Train Passenger Consist: " + passengerBogies);
        System.out.println("UC2 operations completed successfully...");
    }
}