import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS UseCase1TrainConsistInit
 * Use Case 1: Initialize Train and Display Consist Summary
 * * Description:
 * This class represents the entry point of the Train Consist Management Application.
 * It initializes a dynamic list to hold bogies and displays the starting state.
 * * @version 1.0
 */
public class UseCase1TrainConsistInit {

    public static void main(String[] args) {
        // Display welcome banner
        System.out.println("=== Train Consist Management App ===");
        System.out.println("************************************\n");

        // Create a dynamic list to store train bogies
        // We use String for now to represent bogie IDs/Types
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");

        // Show current size (should be 0)
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Display the empty list
        System.out.println("Current Train Consist: " + trainConsist);

        System.out.println("System ready for operations...");
    }
}