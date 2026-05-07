import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;


    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.dictionary = dictionary;
        this.scanner = scanner;

    }
    
    public void start(){
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.contains("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.contains("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();

                System.out.println("Traslation: ");
                String translation = scanner.nextLine();

                dictionary.add(word, translation);

            } else if (command.contains("Search")) {
                System.out.println("To be translated: ");
                String word = scanner.nextLine();

                String translation = dictionary.translate(word);

                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println(dictionary.translate(word));

                } 
            } else {
                System.out.println("Unknown command");
            }
 
        }

    }

}
