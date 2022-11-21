public class Book {
    String bookName;
    String author;
    int createYear;

    public Book (String bookName, String author, int createYear) {
        this.bookName = bookName;
        this.author = author;
        this.createYear = createYear;
    }

    public String getBookName () {
        return bookName;
    }

    public String getAuthor () {
        return author;
    }

    public int getCreateYear () {
        return createYear;
    }
}
