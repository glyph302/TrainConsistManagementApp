import java.util.HashSet;
import java.util.Set;

/**
 * MAIN CLASS UseCase3UniqueBogies
 * Use Case 3: Track Unique Bogie IDs (Set – HashSet)
 * Description: Prevents duplicate bogie registration using the Set interface.
 * @version 3.0
 */
public class UseCase3UniqueBogies {

    public static void main(String[] args) {
        System.out.println("=== UC3 Track Unique Bogie IDs ===");
        System.out.println("==================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet uses a hash table for storage and does not allow duplicates
        Set<String> bogies = new HashSet<>();

        // 1. Adding IDs (including attempted duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // 2. Attempting to add duplicate entries
        // HashSet will check if the ID already exists and ignore these calls
        bogies.add("BG101"); // Duplicate entry
        bogies.add("BG102"); // Duplicate entry

        // 3. Displaying results
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println("UC3 uniqueness validation completed...");
    }
}