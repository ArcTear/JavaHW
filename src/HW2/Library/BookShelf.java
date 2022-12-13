package HW2.Library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

// Решил сделать этот класс без наследования, как обертку для HashMap
public class BookShelf {
    private final HashMap<String, List<Book>> shelf;

    public BookShelf() {
        shelf = new HashMap<>();
    }

    public void put(Book book) {
        if (shelf.get(book.getName()) == null) {
            shelf.put(book.getName(), new ArrayList<>(List.of(book)));
        } else {
            shelf.get(book.getName()).add(book);
        }
    }

    public List<Book> get(String name) {
        if (shelf.get(name) == null) {
            shelf.put(name, new ArrayList<>());
        }
        return shelf.get(name);
    }

    public boolean contains(String name) {
        return shelf.get(name) != null && !shelf.get(name).isEmpty();
    }

    public Collection<List<Book>> values() {
        return shelf.values();
    }
}
