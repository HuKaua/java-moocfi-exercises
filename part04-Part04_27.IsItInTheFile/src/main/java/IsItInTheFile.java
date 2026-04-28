
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean found = false;

        try (Scanner filScanner = new Scanner(Paths.get(file))){
            while (filScanner.hasNextLine()) {
                String row = filScanner.nextLine();
                if (row.equals(searchedFor)) {
                    found = true;
                    break;
                } 
            }
            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }


        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Reading the file " + file + "failed.");
        }

    }
}
