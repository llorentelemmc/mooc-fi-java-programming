

public class Book {
    private String title;
    private String pageNumbers;
    private String publicationYear;

    public Book(String title, String pageNumbers, String publicationYear) {

        this.title = title;
        this.pageNumbers = pageNumbers;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {

        return this.title + ", " + this.pageNumbers + " pages, " + this.publicationYear;

    }

}
