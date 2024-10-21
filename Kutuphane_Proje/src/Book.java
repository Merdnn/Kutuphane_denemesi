import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

    public String Title;
    public String Author;
    public int ISBN;
    public int Pages;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int pages) {
        this.Pages = pages;
    }

    public Book(String title, String author, int pages, int ISBN) {
        this.Title = title;
        this.Author = author;
        this.ISBN = ISBN;
        this.Pages = pages;
    }

    public Book() {


    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + Title + '\'' +
                ", author='" + Author + '\'' +
                ", pageCount=" + Pages +
                ", barcode='" + ISBN + '\'' +
                '}';
    }
}
