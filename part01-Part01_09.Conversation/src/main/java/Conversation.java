
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        System.out.println("Greetings! How are you doing?");
        Scanner scanner = new Scanner(System.in);
        String resp1 = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String resp2 = scanner.nextLine();
        System.out.println("Thanks for sharing!");

    }
}
