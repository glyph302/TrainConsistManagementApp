import java.util.LinkedList;

/**
 * MAIN CLASS UseCase4OrderedConsist
 * Use Case 4: Maintain Ordered Bogie Consist (LinkedList)
 * Description: Models the physical sequence of a train where order matters.
 * @version 4.0
 */
public class UseCase4OrderedConsist {

    public static void main(String[] args) {
        System.out.println("=== UC4 Maintain Ordered Bogie Consist ===");

        // Using LinkedList to maintain the physical sequence of the train
        LinkedList<String> trainConsist = new LinkedList<>();

        // 1. Initial Train Formation
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // 2. Inserting 'Pantry Car' at position 2 (Index 2)
        // LinkedList handles the "re-chaining" of bogies automatically
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // 3. Removing First and Last Bogie
        // In a railway yard, the engine (first) and guard (last) are often detached
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}