package HW2.Library;

import java.util.List;
import java.util.Scanner;


public class Library {
    private final BookShelf library;
    private final BookShelf taken;

    public Library() {
        library = new BookShelf();
        taken = new BookShelf();
    }

    public void add(Book book) {
        library.put(book);
    }

    public void put(String name) {
        if (!taken.contains(name)) {
            System.out.println("Книги с таким именем нет в библиотеке.");
            return;
        }
        if (taken.get(name).size() == 1) {
            Book book = taken.get(name).get(0);
            library.get(name).add(book);
            taken.get(name).remove(0);
            System.out.println("Возвращена книга - " + book);
            return;
        }
        List<Book> books = taken.get(name);
        Book book = taken.get(name).get(getBookNumber(books) - 1);
        library.get(name).add(book);
        taken.get(name).remove(book);
        System.out.println("Возвращена книга - " + book);
    }

    public void get(String name) {
        if (!library.contains(name)) {
            System.out.println("Книги с таким именем нет в библиотеке.");
            return;
        }
        if (library.get(name).size() == 1) {
            taken.get(name).add(library.get(name).get(0));
            Book book = library.get(name).get(0);
            library.get(name).remove(0);
            System.out.println("Взята книга - " + book);
            return;
        }
        List<Book> books = library.get(name);
        int bookNumber = getBookNumber(books);
        taken.get(name).add(library.get(name).get(bookNumber - 1));
        Book book = library.get(name).get(bookNumber - 1);
        library.get(name).remove(bookNumber - 1);
        System.out.println("Взята книга - " + book);
    }

    private int getBookNumber(List<Book> books) {
        Scanner scanner = new Scanner(System.in);
        int bookNumber;
        do {
            for (int i = 1; i <= books.size(); i++) {
                System.out.println(i + ". " + books.get(i - 1));
            }
            System.out.println("Введите номер книги: [1;" + books.size() + "]");
            bookNumber = scanner.nextInt();
            if (bookNumber <= 0 || bookNumber > books.size()) {
                System.out.println("Введено неверное число. Повторите попытку.");
            }
        } while (bookNumber <= 0 || bookNumber > books.size());
        return bookNumber;
    }

    public void printTakenBooks() {
        System.out.println("Взятые книги:");
        for (List<Book> books : taken.values()) {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void printAllBooks() {
        int quantity = 0;
        System.out.println("Список всех книг:");
        for (List<Book> books : library.values()) {
            quantity += books.size();
            for (Book book : books) {
                System.out.println(book);
            }
        }
        for (List<Book> books : taken.values()) {
            quantity += books.size();
            for (Book book : books) {
                System.out.println(book);
            }
        }
        System.out.println("Общее количество книг: " + quantity);
    }
}
