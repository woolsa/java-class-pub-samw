package exercise10;

import java.util.Comparator;
import java.util.Objects;

/**
 * Class Book
 * @author woolsa01
 * @assignment exercise10
 */
public class Book {
    final String title;
    final String author;
    Double price;
    final Integer year;

    public Book(String title, String author, Double price, Integer year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }
    
    public Book(Book obj) {
        this.title = obj.title;
        this.author = obj.author;
        this.price = obj.price;
        this.year = obj.year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getYear() {
        return year;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.title);
        hash = 53 * hash + Objects.hashCode(this.author);
        hash = 53 * hash + Objects.hashCode(this.price);
        hash = 53 * hash + Objects.hashCode(this.year);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return Objects.equals(this.year, other.year);
    }
    
    @Override
    public String toString() {
        return String.format("%s (%d) by %s costs $%.2f", title, year, author, price);
    }
}

class ByTitle implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.title.compareTo(b.title);
    }
}

class ByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.author.compareTo(b.author);
    }
}

class ByPrice implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.price.compareTo(b.price);
    }
}

class ByYear implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.year.compareTo(b.year);
    }
}
