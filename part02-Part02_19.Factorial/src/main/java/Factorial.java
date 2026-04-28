
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        int factorial = 0;
        int cont = 0;
        for(int i = factorial; cont< number; ){
            factorial = i*i;
            cont = cont++;

        }   
        System.out.println("Factorial " + factorial);

    }
}
