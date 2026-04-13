import java.util.*;
import java.util.stream.Collectors;

/**
 * MAIN CLASS UseCase9GroupBogies
 * Use Case 9: Group Bogies by Type (Collectors.groupingBy)
 * Description: Categorizes bogies into groups for structured reporting.
 * @version 9.0
 */
public class UseCase9GroupBogies {

    public static void main(String[] args) {
        System.out.println("=== UC9 Group Bogies by Type ===");

        // 1. Initialize a list of bogie names
        List<String> bogieList = Arrays.asList(
                "Sleeper-01", "AC-01", "Goods-01",
                "Sleeper-02", "Sleeper-03", "AC-02",
                "Goods-02", "Pantry-01"
        );

        // 2. Use Stream API to group bogies by their category
        // Logic: We split the string by "-" and take the first part as the category
        Map<String, List<String>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(bogie -> bogie.split("-")[0]));

        // 3. Display the structured results
        System.out.println("\n--- Categorized Bogie Report ---");
        groupedBogies.forEach((category, bogies) -> {
            System.out.println("Category: [" + category + "] -> Bogies: " + bogies);
        });

        // 4. Analytics: Count bogies per category
        System.out.println("\n--- Consist Summary ---");
        groupedBogies.forEach((category, list) ->
                System.out.println(category + " Count: " + list.size()));

        System.out.println("\nUC9 bogie grouping completed successfully...");
    }
}