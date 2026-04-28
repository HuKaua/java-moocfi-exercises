
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // IF NOT EMPTY, GET THE FIRST NAME
        while (true) {
            System.out.println("First name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }
            
            // INPUT THE FIRST NAME
            System.out.println("Last name: ");
            String lastName = String.valueOf(scanner.nextLine());

            System.out.println("Identification number: ");
            int id = Integer.valueOf(scanner.nextLine());

            infoCollection.add(new PersonalInformation(firstName, lastName, lastName));

            for (PersonalInformation personalInformation : infoCollection) {
                System.out.println(firstName +" " + lastName);
        }
        
        }
        


    }
}
