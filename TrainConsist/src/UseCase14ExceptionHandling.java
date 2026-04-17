/**
 * MAIN CLASS UseCase14ExceptionHandling
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 * Description: Prevents creation of bogies with invalid seating capacities.
 * @version 14.0
 */
public class UseCase14ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("=== UC14 Train Safety: Capacity Validation ===");

        // Test cases: One valid, one negative, one zero
        int[] capacitiesToTest = {72, -5, 0};

        for (int cap : capacitiesToTest) {
            try {
                System.out.println("\nAttempting to register bogie with capacity: " + cap);
                validateCapacity(cap);
                System.out.println("Registration Successful ✔");
            } catch (InvalidBogieException e) {
                // Catching the specific railway error
                System.err.println("Registration Failed: " + e.getMessage());
            }
        }

        System.out.println("\nUC14 exception handling completed successfully...");
    }

    /**
     * Business logic to validate capacity rules
     * @throws InvalidBogieException if capacity is less than 1
     */
    public static void validateCapacity(int capacity) throws InvalidBogieException {
        if (capacity < 0) {
            throw new InvalidBogieException("Safety Violation: Capacity cannot be negative!");
        } else if (capacity == 0) {
            throw new InvalidBogieException("Efficiency Warning: Passenger bogie cannot have zero seats!");
        }
    }
}