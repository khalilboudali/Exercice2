import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
public void addBook(Book book) {
    books.add(book);
   }
}

// Ajoutez des méthodes pour mettre à jour et récupérer des livres
