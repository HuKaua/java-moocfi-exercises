
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // reading until the empty line
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            // printando a ultima palavra
            } else {
                String[] pieces = input.split("\\s+");
                int index = pieces.length -1;
                System.out.println(pieces[index]);
            }
        }


    }
}
