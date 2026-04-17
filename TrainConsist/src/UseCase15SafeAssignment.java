/**
 * MAIN CLASS UseCase15SafeAssignment
 * Use Case 15: Safe Cargo Assignment (try-catch-finally)
 * Description: Ensures system stability during runtime cargo updates.
 * @version 15.0
 */
public class UseCase15SafeAssignment {

    public static void main(String[] args) {
        System.out.println("=== UC15 Operational Safety Management ===");

        // Test Scenario: Attempting to assign 'Petroleum' to a 'Rectangular' bogie
        assignCargoToBogie("Rectangular", "Petroleum");

        System.out.println("\n--- Next Operation ---");
        
        // Test Scenario: Valid assignment
        assignCargoToBogie("Cylindrical", "Petroleum");

        System.out.println("\nUC15 resilient handling completed successfully...");
    }

    public static void assignCargoToBogie(String bogieType, String cargoType) {
        System.out.println("Processing Assignment: " + cargoType + " -> " + bogieType);

        try {
            // Business Logic: Only Cylindrical bogies can carry Petroleum
            if (cargoType.equalsIgnoreCase("Petroleum") && !bogieType.equalsIgnoreCase("Cylindrical")) {
                throw new Exception("CRITICAL SAFETY VIOLATION: Liquid fuel requires Cylindrical bogies!");
            }
            
            System.out.println("Status: Assignment Validated and Applied ✔");

        } catch (Exception e) {
            // Graceful handling: Log the error instead of crashing the app
            System.err.println("ALARM: " + e.getMessage());
            System.err.println("Action: Reverting assignment to prevent hazard.");

        } finally {
            // This block ALWAYS runs, regardless of success or failure
            System.out.println("System Log: Transaction audit finalized for this unit.");
        }
    }
}