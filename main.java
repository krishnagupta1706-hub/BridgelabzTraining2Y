public class Main {

    public static class Book {
        int bookId;
        String title;
        String author;
        double price;

        public Book(int bookId, String title, String author, double price) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.price = price;
        }

        @Override
        public String toString() {
            return "[" + bookId + "] " + title + " - Rs. " + price;
        }
    }

    public static int removeDuplicates(Book[] books, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (books[i].bookId != books[j].bookId) {
                j++;
                books[j] = books[i];
            }
        }
        return j + 1;
    }

    public static void searchByTitle(Book[] books, int count, String query) {
        System.out.println("Search Results for '" + query + "':");
        boolean found = false;
        String lowerQuery = query.toLowerCase();

        for (int i = 0; i < count; i++) {
            if (books[i].title.toLowerCase().contains(lowerQuery)) {
                System.out.println("- Found: " + books[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching books found.");
        }
    }

    public static void sortByPrice(Book[] books, int count) {
        int totalSwaps = 0;

        for (int i = 0; i < count - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (books[j].price < books[minIndex].price) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Book temp = books[i];
                books[i] = books[minIndex];
                books[minIndex] = temp;
                totalSwaps++;
            }
        }

        System.out.println("Books Sorted by Price:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
        System.out.println("Total Swaps: " + totalSwaps);
    }

    public static int searchByPrice(Book[] books, int count, double targetPrice) {
        int low = 0;
        int high = count - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (books[mid].price == targetPrice) {
                return mid;
            } else if (books[mid].price < targetPrice) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int minBooksForTargetCost(Book[] books, int count, double targetCost) {
        int minLength = Integer.MAX_VALUE;
        double currentSum = 0.0;
        int left = 0;

        for (int right = 0; right < count; right++) {
            currentSum += books[right].price;

            while (currentSum >= targetCost) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= books[left].price;
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Data Structures", "Mark", 400.0),
            new Book(101, "Data Structures", "Mark", 400.0), // Duplicate
            new Book(102, "Java Basics", "James", 300.0),
            new Book(103, "Python Guide", "Guido", 600.0),
            new Book(104, "Database Systems", "Raghu", 500.0),
            new Book(105, "Computer Networks", "Andrew", 700.0)
        };

        int uniqueCount = removeDuplicates(books, books.length);
        System.out.println("1. After Task 1 (Remove Duplicates):");
        System.out.println("Unique Books Count: " + uniqueCount);
        System.out.println("Book List:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(books[i]);
        }
        System.out.println();

        System.out.println("2. After Task 2 (Search Query: 'data'):");
        searchByTitle(books, uniqueCount, "data");
        System.out.println();

        System.out.println("3. After Task 3 (Sort by Price):");
        sortByPrice(books, uniqueCount);
        System.out.println();

        double targetPrice = 500.0;
        System.out.println("4. After Task 4 (Search for Price: " + targetPrice + "):");
        System.out.println("Searching for Price Rs. " + targetPrice + "...");
        int foundIndex = searchByPrice(books, uniqueCount, targetPrice);
        if (foundIndex != -1) {
            System.out.println("Result: Book found at index " + foundIndex + ": " + books[foundIndex]);
        } else {
            System.out.println("Result: Book not found.");
        }
        System.out.println();

        double targetCost = 1000.0;
        System.out.println("5. After Task 5 (Sliding Window for Target Cost S = Rs. " + targetCost + "):");
        System.out.println("Finding minimum consecutive books whose total price >= Rs. " + targetCost + "...");
        int minBooks = minBooksForTargetCost(books, uniqueCount, targetCost);
        System.out.println("Minimum Consecutive Books Needed: " + minBooks);
    }
}
