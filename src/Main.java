

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Ed", "Smith");
        Book book1 = new Book("Winter", "1950",author1);
        Author author2 = new Author("Sam", "Johnson");
        Book book2 = new Book("lowe time", "2000",author2);

        book1.setPublicYear("1965");
        System.out.println("Книга 1");
        System.out.println("Название: " + book1.getBookName() + " Автор: " + author1.getFirstName() +
                " " +author1.getLastName() + " год публикации: " + book1.getPublicYear());
        System.out.println("Книга 2");
        System.out.println("Название: " + book2.getBookName() + " Автор: " + author2.getFirstName() +
                " " +author2.getLastName() + " год публикации: " + book2.getPublicYear());







    }

}
