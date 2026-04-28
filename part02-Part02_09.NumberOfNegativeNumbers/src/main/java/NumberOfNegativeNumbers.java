
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativos = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0) {
                negativos = negativos + 1;
                continue;
            } else if (number > 0){
                continue;
            } else {
                break;
            }

        }
        System.out.println("Number of negative numbers: " + negativos);
    }
}
