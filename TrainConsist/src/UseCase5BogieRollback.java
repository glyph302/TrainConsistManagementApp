import java.util.Stack;

/**
 * MAIN CLASS UseCase5BogieRollback
 * Use Case 5: Preserve Insertion Order (Stack Implementation)
 * Description: Models LIFO behavior for last-minute attachments and rollbacks.
 * @version 5.0
 */
public class UseCase5BogieRollback {

    public static void main(String[] args) {
        System.out.println("=== UC5 Train Yard: Last-Attachment Handling ===");

        // Stack models the LIFO (Last-In, First-Out) behavior
        Stack<String> bogieStack = new Stack<>();

        // 1. Attaching bogies in sequence
        System.out.println("Attaching bogies to the consist...");
        bogieStack.push("Sleeper-V1");
        bogieStack.push("AC-V2");
        bogieStack.push("Pantry-V3");

        System.out.println("Current Consist (Bottom to Top): " + bogieStack);

        // 2. Emergency Removal (Rollback)
        // The last one attached (Pantry-V3) must be the first one removed
        if (!bogieStack.isEmpty()) {
            String removedBogie = bogieStack.pop();
            System.out.println("\nEmergency: Fault detected in last attachment!");
            System.out.println("Removing bogie: " + removedBogie);
        }

        // 3. Inspecting the new 'Last' bogie without removing it
        if (!bogieStack.isEmpty()) {
            System.out.println("Current last bogie in consist: " + bogieStack.peek());
        }

        System.out.println("\nFinal Consist State: " + bogieStack);
        System.out.println("UC5 LIFO operations completed successfully...");
    }
}