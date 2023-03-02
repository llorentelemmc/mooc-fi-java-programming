
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());

        //The id of the book is also the index
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + (i + 1)));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchIndex = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchIndex < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchIndex));
        }

        System.out.println("");
        System.out.println("Searching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchIndex = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchIndex < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchIndex));
        }
    }


    public static int linearSearch(ArrayList<Book> books, long searchedId) {

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int low = 0;
        int high = (books.size() - 1);

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = books.get(mid).getId();

            if (guessEqualsItem(guess, searchedId)) {
                return mid;
            } else if (guessGreaterThanItem(guess, searchedId)) {
                high = mid - 1;
            } else if (guessLessThanItem(guess, searchedId)) {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static boolean guessEqualsItem(int guess, long searchedId) {
        if (guess != searchedId) {
            return false;
        }
        return true;
    }

    public static boolean guessGreaterThanItem(int guess, long searchedId) {
        if (guess > searchedId) {
            return true;
        }
        return false;
    }

    public static boolean guessLessThanItem(int guess, long searchedId) {
        if (guess < searchedId) {
            return true;
        }
        return false;
    }

}


