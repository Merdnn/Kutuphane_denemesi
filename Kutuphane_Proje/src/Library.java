
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();

    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Kitabınız başarıyla eklendi: " + book);
    }
    public void listBooks() {
        System.out.println("Kütüphanedeki Kitaplar asdfasdf: ");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Kitap eklemek istiyor musunuz:  asdfasgdasdf");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("evet")) {
                System.out.print("Kitap adı giriniz: ");
                String title = scanner.nextLine();

                System.out.print("Kitabın yazarını giriniz: ");
                String author = scanner.nextLine();

                System.out.print("Kitabın sayfa sayısını giriniz: ");
                int pages = scanner.nextInt();

                System.out.print("Kitabın ISBN'sini giriniz: ");
                int isbn = scanner.nextInt();

                Book newBook = new Book(title, author, pages, isbn);
                library.addBook(newBook);
                System.out.print("Kitabınız başarıyla eklendi. İyi günler.");
                break;
            } else if (choice.equalsIgnoreCase("hayır")) {
                System.out.print("Tamamdır... İyi günler.");
                break;
            } else {
                System.out.println("Yanlış komut girdiniz, lütfen tekrar deneyin.");
            }
        }
    }



}

