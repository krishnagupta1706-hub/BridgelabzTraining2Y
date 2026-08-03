public class LinearSearchTimeComplexity {

    public static void main(String[] args) {

        int[] arr = {8, 61, 2, 3, 4, 0};

        System.out.println("Linear Search Time Complexity Analysis");
        System.out.println();

        // Best Case
        System.out.println("1. Best Case - O(1)");
        System.out.println("Target: 8");
        System.out.println("Explanation: The target is the first element, so only one comparison is required.");
        System.out.println();

        // Worst Case
        System.out.println("2. Worst Case - O(n)");
        System.out.println("Target: 0 (last element) or 5 (not present)");
        System.out.println("Explanation: The algorithm checks every element before finding the target or determining it is absent.");
        System.out.println();

        // Average Case
        System.out.println("3. Average Case - O(n)");
        System.out.println("Target: Any random position");
        System.out.println("Explanation: On average, about n/2 elements are checked. Ignoring constants, the complexity is O(n).");
    }
}
