public class MergeSortRecursionTree {

    public static void main(String[] args) {

        System.out.println("Merge Sort - Recursion Tree");
        System.out.println();

        System.out.println("Sample Array = {8, 61, 2, 3, 4, 0}");
        System.out.println();

        System.out.println("1. Division / Split Tree");
        System.out.println("{8, 61, 2, 3, 4, 0}");
        System.out.println("   /                 \\");
        System.out.println("{8, 61, 2}       {3, 4, 0}");
        System.out.println(" /      \\         /      \\");
        System.out.println("{8}  {61,2}    {3}    {4,0}");
        System.out.println("      /   \\            /   \\");
        System.out.println("    {61} {2}        {4}   {0}");
        System.out.println();

        System.out.println("2. Recurrence Relation");
        System.out.println("T(n) = 2T(n/2) + n");
        System.out.println();
        System.out.println("Level 0 : n");
        System.out.println("Level 1 : n");
        System.out.println("Level 2 : n");
        System.out.println("...");
        System.out.println("Last Level : n");
        System.out.println();
        System.out.println("Number of levels = log2(n)");
        System.out.println("Total Work = n * log2(n)");
        System.out.println("Time Complexity = O(n log n)");
    }
}
