import java.util.Objects;

public class Book {
    private String bookName;
    private String publicYear;
    private Author author;


    public Book(String bookName, String publicYear, Author author) {
        this.bookName = bookName;
        this.author = author;
        this.publicYear = publicYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(String publicYear) {
        this.publicYear = publicYear;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && publicYear.equals(book.publicYear) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publicYear, author);
    }
}