public class Book {
     String bookName;
    String publicYear;
    String author;


    public Book (String bookName, String publicYear, String author) {
        this.bookName = bookName;
        this.author = author;
        this.publicYear = publicYear;
    }

    public String getBookName () {
        return bookName;
    }

    public String getAuthor () {
        return author;
    }

    public String getPublicYear () {
        return publicYear;
    }

    public void setPublicYear (String publicYear) {
        this.publicYear = publicYear;
    }
}
