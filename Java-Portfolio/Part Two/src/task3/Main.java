package task3;

/* 
 * Name: Andrew Phillips
 * I pledge by honour that this program is solely my own work
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();

        books.add(new Book("Lonely Planet Hungarian Phrasebook & Dictionary", 256));
        books.add(new Book("Learning the Art of Electronics : A Hands-On Lab Course", 1150));
        books.add(new Book("The Foundations of Leninism", 126));

        BookApp bkapp = new BookApp();
        int totalPages = bkapp.calcTotalPages(books, 0);
        System.out.printf("Total number of books: %d\n", books.size());
        System.out.printf("Total pages: %d\n", totalPages);
    }
}
