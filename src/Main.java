

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Ed", "Smith");
        Book book1 = new Book("Winter", "1950",author1);
        Author author2 = new Author("Sam", "Johnson");
        Book book2 = new Book("lowe time", "2000",author2);



        System.out.println("Книга 1");
        System.out.println(book1);
        System.out.println("Книга 2");
        System.out.println(book2);


    }

}
