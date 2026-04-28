import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break; // O teste exige parar se o nome TAMBÉM for vazio
            }

            Item newItem = new Item(identifier, name);

            // Só adiciona se o ID ainda não existir na lista
            // Isso garante que manteremos a PRIMEIRA versão do item
            if (!(items.contains(newItem))) {
                items.add(newItem);
            }
        }

        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}