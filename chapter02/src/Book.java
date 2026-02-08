public class Book {
    int pages;

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.pages = 300;
        Book book2 = new Book();
        book2.pages = 500;

        book2 = book1;

        System.out.println(book2.pages);

        book1.pages = 999;

        System.out.println(book2.pages);

    }
}
