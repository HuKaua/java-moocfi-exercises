
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int older = 0;

        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            } else {
                String[] pieces = text.split(",");
                int currentAge = Integer.parseInt(pieces[1]);
                for (int i = 0; i < currentAge; i++) {
                    if (currentAge > older) {
                        older = currentAge;
                    }
                    System.out.println("The older is " + older);
                }

            }  

                


        }


    }
    
}
