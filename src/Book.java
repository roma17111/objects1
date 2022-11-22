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

    public String toString() {
        return "Название книги: " + bookName + " Автор книги: " + author + " год публикации: " +
                publicYear;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book2 = (Book) other;
        return author.equals(book2.author);
    }

}