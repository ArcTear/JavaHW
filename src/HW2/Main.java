package HW2;

import java.util.List;
import java.util.Scanner;

import HW2.Library.Book;
import HW2.Library.Library;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1", List.of("1"), 2022);
        library.add(book1);
        Book book2 = new Book("2", List.of("2"), 2022);
        library.add(book2);
        library.add(book2);
        library.add(book2);
        library.add(book2);
        library.add(book2);
        String command;
        System.out.println("Возможные команды:" +
                "\nget <name> - взять книгу с названием name" +
                "\nput <name> - вернуть книгу с именем name" +
                "\nlist - список взятых книг" +
                "\nall - список всех взятых книг и их количество");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите команду: ");
            command = scanner.nextLine();
            if (command.matches("get .*")) {
                library.get(command.substring(command.indexOf(' ') + 1));
            } else if (command.matches("put .*")) {
                library.put(command.substring(command.indexOf(' ') + 1));
            } else if (command.equals("list")) {
                library.printTakenBooks();
            } else if (command.equals("all")) {
                library.printAllBooks();
            } else if (command.equals("exit")) {
                System.out.println("Работа программы закончена.. Пока...");
            }
        } while (!command.equals("exit"));
    }
}
