import java.util.*;
import java.util.stream.Collectors;

/**
 * MAIN CLASS UseCase13PerformanceComparison
 * Use Case 13: Performance Comparison (Loops vs Streams)
 * Description: Benchmarks execution time using System.nanoTime().
 * @version 13.0
 */
public class UseCase13PerformanceComparison {

    public static void main(String[] args) {
        System.out.println("=== UC13 Performance: Loops vs Streams ===");

        // 1. Prepare a massive dataset (100,000 bogies)
        List<Integer> largeConsist = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            largeConsist.add(random.nextInt(100)); // Capacity between 0-99
        }

        System.out.println("Dataset Size: " + largeConsist.size() + " bogies\n");

        // 2. Benchmark: Traditional For-Each Loop
        long startTimeLoop = System.nanoTime();
        int countLoop = 0;
        for (int capacity : largeConsist) {
            if (capacity > 50) {
                countLoop++;
            }
        }
        long endTimeLoop = System.nanoTime();
        long durationLoop = endTimeLoop - startTimeLoop;

        // 3. Benchmark: Java Stream API
        long startTimeStream = System.nanoTime();
        long countStream = largeConsist.stream()
                .filter(c -> c > 50)
                .count();
        long endTimeStream = System.nanoTime();
        long durationStream = endTimeStream - startTimeStream;

        // 4. Display Results
        System.out.println("--- Results ---");
        System.out.println("For-Each Loop Time : " + durationLoop + " ns");
        System.out.println("Stream API Time    : " + durationStream + " ns");

        double ratio = (double) durationStream / durationLoop;
        System.out.printf("\nStream is %.2fx slower/faster than Loop in this run.%n", ratio);

        System.out.println("\nNote: Performance varies by JVM warm-up and dataset size.");
        System.out.println("UC13 benchmarking completed successfully...");
    }
}