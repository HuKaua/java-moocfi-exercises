
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int cont = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0 ) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number > 0) {
                soma = soma + number;
                cont = cont + 1;
            } else{
                continue;
            }
            

        }
        System.out.println(soma /cont);
    }
}
