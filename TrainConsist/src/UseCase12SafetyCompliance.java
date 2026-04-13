import java.util.*;
import java.util.stream.Collectors;

/**
 * MAIN CLASS UseCase12SafetyCompliance
 * Use Case 12: Safety Compliance Check for Goods Bogies
 * Description: Enforces physical safety rules for cargo-bogie compatibility.
 * @version 12.0
 */
public class UseCase12SafetyCompliance {

    public static void main(String[] args) {
        System.out.println("=== UC12 Goods Bogie Safety Compliance ===");

        // 1. Define Safety Rules (Bogie Type -> Allowed Cargo)
        Map<String, String> safetyRules = new HashMap<>();
        safetyRules.put("Cylindrical", "Liquid");
        safetyRules.put("Rectangular", "Solid");

        // 2. Current Consist: List of Bogie objects (represented as Maps for simplicity)
        List<Map<String, String>> currentCargoManifest = new ArrayList<>();

        currentCargoManifest.add(createBogie("B-001", "Cylindrical", "Liquid"));
        currentCargoManifest.add(createBogie("B-002", "Rectangular", "Solid"));
        currentCargoManifest.add(createBogie("B-003", "Cylindrical", "Solid")); // UNSAFE!

        // 3. Safety Audit using Streams
        System.out.println("\n--- Initiating Safety Audit ---");

        List<Map<String, String>> unsafeBogies = currentCargoManifest.stream()
                .filter(bogie -> {
                    String shape = bogie.get("shape");
                    String cargo = bogie.get("cargo");
                    // Check if the cargo matches the required type for that shape
                    return !safetyRules.get(shape).equals(cargo);
                })
                .collect(Collectors.toList());

        // 4. Reporting Results
        if (unsafeBogies.isEmpty()) {
            System.out.println("Result: ALL BOGIES COMPLIANT. Permission to depart granted.");
        } else {
            System.err.println("ALERT: SAFETY VIOLATION DETECTED!");
            unsafeBogies.forEach(b ->
                    System.out.println("Violation: Bogie " + b.get("id") +
                            " (" + b.get("shape") + ") cannot carry " + b.get("cargo")));
            System.out.println("\nAction: Please re-assign cargo before departure.");
        }

        System.out.println("\nUC12 safety check completed successfully...");
    }

    // Helper method to create a bogie entry
    private static Map<String, String> createBogie(String id, String shape, String cargo) {
        Map<String, String> bogie = new HashMap<>();
        bogie.put("id", id);
        bogie.put("shape", shape);
        bogie.put("cargo", cargo);
        return bogie;
    }
}