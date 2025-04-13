import java.util.*;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void sort(){
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

    public void show(){
        for (Book show : books) {
            show.info();
        }
    }

    public void filterBooks(BookFilter filter) {
        System.out.println("Результати фільтрації:");
        boolean found = false;

        for (Book book : books) {
            if (filter.filter(book)) {
                book.info();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книги, що відповідають критеріям фільтрації, не знайдено");
        }
    }

    public class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void info() {
            System.out.println("Назва книги: " + title);
            System.out.println("Автор: " + author);
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
}