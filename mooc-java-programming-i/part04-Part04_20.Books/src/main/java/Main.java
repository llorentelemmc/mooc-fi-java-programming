import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> bookCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            String pageNumbers = scanner.nextLine();


            System.out.print("Publication year: ");
            String publicationYear = scanner.nextLine();

            bookCollection.add(new Book(title, pageNumbers, publicationYear));

        }

        System.out.println();
        System.out.println("What information will be printed?");
        String response = scanner.nextLine();

        for (Book book : bookCollection) {
            if (response.equals("everything")) {
                System.out.println(book);
            }
            if (response.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}


