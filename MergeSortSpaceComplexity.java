public class MergeSortSpaceComplexity {

    public static void main(String[] args) {

        System.out.println("Merge Sort Space Complexity");
        System.out.println();

        System.out.println("Sample Array = {8, 61, 2, 3, 4, 0}");
        System.out.println();

        System.out.println("1. Auxiliary Space Complexity");
        System.out.println("Merge Sort divides the array into smaller parts.");
        System.out.println("While merging, it creates temporary arrays");
        System.out.println("to store the left and right subarrays.");
        System.out.println("Because of these temporary arrays,");
        System.out.println("the auxiliary space complexity is O(n).");
        System.out.println();

        System.out.println("2. Comparison with In-place Sorting");
        System.out.println("Insertion Sort is an in-place algorithm.");
        System.out.println("Its auxiliary space complexity is O(1).");
        System.out.println();
        System.out.println("Quick Sort is also in-place.");
        System.out.println("It uses recursion, so its extra space is O(log n) on average.");
        System.out.println();
        System.out.println("Merge Sort uses more memory than");
        System.out.println("Insertion Sort and Quick Sort,");
        System.out.println("but it provides stable sorting with O(n log n) time.");
    }
}
