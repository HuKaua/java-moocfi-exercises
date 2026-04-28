
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lines = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());



        try (Scanner scannerFile = new Scanner (Paths.get(file))){
            while (scannerFile.hasNextLine()) {
                int row = Integer.valueOf(scannerFile.nextLine());

                if (row <= upperBound && row >= lowerBound)  {
                    lines.add(row);
                }
                
            }
            System.out.println("Numbers: " + lines.size());
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
