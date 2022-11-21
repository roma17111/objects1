

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Winter", "1950","Smith");
        Author author1 = new Author("Ed", "Smith");
        Book book2 = new Book("lowe time", "2000","Johnson");
        Author author2 = new Author("Sam", "Johnson");
        book1.setPublicYear("1965");
        System.out.println("Книга 1");
        System.out.println("Название: " + book1.getBookName() + " Автор: " + book1.getAuthor() +
                " год публикации: " + book1.getPublicYear() + " Фамилия и имя автора: " + author1.firstName + " "
         + author1.lastName);
        System.out.println("Книга 2");
        System.out.println("Название: " + book2.getBookName() + " Автор: " + book2.getAuthor() +
                " год публикации: " + book2.getPublicYear() + " Фамилия и имя автора: " + author2.firstName + " "
                + author2.lastName);






    }

}
