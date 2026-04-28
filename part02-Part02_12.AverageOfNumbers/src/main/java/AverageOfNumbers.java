
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int count = 0; // better to use int for counting

        while (true) {
            System.out.println("Give a number:");
            double userInput = Double.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            }

            soma = soma + userInput;
            count = count + 1;
        }

        if (count > 0) {
            double average = soma / count;
            System.out.println("Average of the numbers: " + average);
        }
    }
}

