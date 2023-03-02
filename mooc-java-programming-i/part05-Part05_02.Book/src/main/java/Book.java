public class Book {

    // instance variables
    private String author;
    private String title;
    private int pages;

    // constructor
    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    // methods
    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public String toString() {
        return this.author + ", " + this.title + ", " + this.pages + " pages";
    }
}
