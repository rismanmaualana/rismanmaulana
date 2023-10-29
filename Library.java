import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        ArrayList<Book> bookList = new ArrayList<>();

        // Adding books to the library
        bookList.add(new Book("pbo with Java", "indrajani", "elexmedia", 1, 2007));
        bookList.add(new Book("basic Java", "abdul kadir", "and offset", 1, 2004));
        bookList.add(new Book("si doel", "doel", "library hall", 3, 1932));

        while (true) {
            System.out.println("======================================================================================");
            System.out.println("1. Add a new book");
            System.out.println("2. List all books");
            System.out.println("3. Count available books by category");
            System.out.println("4. Exit");
            System.out.println("======================================================================================");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the new line character

            switch (choice) {
                case 1:
                    System.out.print("Enter the title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the publisher: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Enter the category: ");
                    int category = scanner.nextInt();
                    System.out.print("Enter the year: ");
                    int year = scanner.nextInt();
                    bookList.add(new Book(title, author, publisher, category, year));
                    System.out.println("Book added successfully!");
                    break;
                case
