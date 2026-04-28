
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

       while (true) {
    System.out.println("Name (empty will stop):");
    String name = scanner.nextLine();
    if (name.isEmpty()) {
        break;
    }

    System.out.println("Publication year:");
    int publicationYear = Integer.valueOf(scanner.nextLine());
    
    // 1. Primeiro criamos o livro com os dados que recebemos
    Book book = new Book(name, publicationYear);

    // 2. Agora verificamos se esse livro (book) já existe na lista
    if (books.contains(book)) {
        System.out.println("The book is already on the list. Let's not add the same book again.");
    } else {
        // 3. Se não existir, aí sim adicionamos
        books.add(book);
    }
}
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
