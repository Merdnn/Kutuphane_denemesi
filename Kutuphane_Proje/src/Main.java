
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book bookOne = new Book();
        bookOne.setTitle("Sefiller");
        bookOne.setAuthor("Viktor Hugo");
        bookOne.setPages(123);
        bookOne.setISBN(1);

        Book bookTwo = new Book();
        bookTwo.setTitle("Suç ve Ceza");
        bookTwo.setAuthor("Dostoyevski");
        bookTwo.setPages(456);
        bookTwo.setISBN(2);


        Book bookThree = new Book();
        bookThree.setTitle("Veronika Ölmek İstiyor");
        bookThree.setAuthor("Paulo Coelho");
        bookThree.setPages(789);
        bookThree.setISBN(3);


        List<Book> books = new ArrayList<Book>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

    }
}

