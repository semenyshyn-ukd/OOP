public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.add(lib.new Book("1984", "Джордж Орвелл"));
        lib.add(lib.new Book("Майстер і Маргарита", "Михайло Булгаков"));
        lib.add(lib.new Book("Гаррі Поттер", "Джоан Роулінг"));
        lib.add(lib.new Book("Кобзар", "Тарас Шевченко"));

        System.out.println("Бібліотека до сортування:");
        lib.show();

        lib.sort();
        System.out.println("\nБібліотека після сортування:");
        lib.show();

        System.out.println("\nФільтрація книг, автор яких починається на 'Д':");
        lib.filterBooks(new BookFilter() {
            @Override
            public boolean filter(Library.Book book) {
                return book.getAuthor().startsWith("Д");
            }
        });
    }
}
