
import java.util.*;

/**
 * @author Mihai Ember, v 1.0, 20.01.2018
 * Library app, lets you keep the evidence of your library
 */
public class App {
    public static void main(String[] args) {

        /**
         * instantiate an arraylist of books
         */
        ArrayList<Book> books = new ArrayList<Book>();

        /**
         * use method add(), to add books to your library
         */
        books.add(new Novel("In vreme de razboi", 100, "istorie"));
        books.add(new Novel("Moara cu noroc", 150, "poveste"));
        books.add(new Album("Album1", 26, "buna"));
        books.add(new Novel("Sarpele", 9, "poveste"));
        books.add(new Album("Culori vii", 11, "acceptabila"));
        books.add(new Album("Postere", 10, "buna"));
        books.add(new Novel("La tiganci", 59, "poveste"));
        /**
         * use method remove() for removing books from tour library
         */
        books.remove(1);

        System.out.println(books);
        System.out.println("Dimensiunea librarieie este:" + books.size());

        books.remove(0);
        System.out.println(books);
        System.out.println("Dimensiunea librarieie este:" + books.size());

    }
}
