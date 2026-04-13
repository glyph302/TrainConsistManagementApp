import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * MAIN CLASS UseCase11DataValidation
 * Use Case 11: Validate Train ID & Cargo Codes (Regex)
 * Description: Ensures data integrity by validating strings against strict patterns.
 * @version 11.0
 */
public class UseCase11DataValidation {

    public static void main(String[] args) {
        System.out.println("=== UC11 Railway Data Validation ===");

        // 1. Define Patterns
        // ^TRN-\\d{4}$ means: Starts with TRN, followed by a hyphen, and exactly 4 digits
        String trainIdPattern = "^TRN-\\d{4}$";

        // ^[A-Z]{3}\\d{2}$ means: Exactly 3 uppercase letters followed by 2 digits (e.g., OIL01)
        String cargoCodePattern = "^[A-Z]{3}\\d{2}$";

        // 2. Test Data
        String[] testTrainIds = {"TRN-1234", "TRAIN12", "TRN-99A1", "TRN-5566"};
        String[] testCargoCodes = {"OIL01", "gas22", "CHEM-5", "COA99"};

        // 3. Validate Train IDs
        System.out.println("\n--- Validating Train IDs ---");
        for (String id : testTrainIds) {
            boolean isValid = Pattern.matches(trainIdPattern, id);
            System.out.println("ID: " + id + " -> " + (isValid ? "VALID ✔" : "INVALID ❌"));
        }

        // 4. Validate Cargo Codes using Pattern and Matcher classes
        System.out.println("\n--- Validating Cargo Codes ---");
        Pattern pattern = Pattern.compile(cargoCodePattern);

        for (String code : testCargoCodes) {
            Matcher matcher = pattern.matcher(code);
            if (matcher.matches()) {
                System.out.println("Code: " + code + " -> ACCEPTED");
            } else {
                System.out.println("Code: " + code + " -> REJECTED (Format Mismatch)");
            }
        }

        System.out.println("\nUC11 regex validation completed successfully...");
    }
}