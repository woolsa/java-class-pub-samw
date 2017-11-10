package exercise5;

/**
 * Class Book
 * Task 2: Create a class Book with the following private data members: String title, String author, double price
 * @author woolsa01
 */
public class Book {
    private final String title;
    private final String author;
    private final double price;
    
public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
}

public String getTitle() {
    return title;
}

public String getAuthor() {
    return author;
}

public double getPrice() {
    return price;
}

    @Override
    public String toString() {
    return String.format("%s by %s costs %.2f", title, author, price);
}

}
