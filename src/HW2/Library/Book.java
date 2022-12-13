package HW2.Library;

import java.util.List;
import java.util.Objects;

public class Book {
    private final String name;
    private final List<String> authors;
    private final Integer year;

    public Book(String name, List<String> authors, Integer year) {
        this.name = name;
        this.authors = authors;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && authors.equals(book.authors) && year.equals(book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authors, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + authors +
                ", year=" + year +
                '}';
    }
}
