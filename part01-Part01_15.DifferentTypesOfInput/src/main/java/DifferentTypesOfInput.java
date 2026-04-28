
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //primeiro input, string
        System.out.println("Give a string:");
        String texto = scan.nextLine();

        //segundo input, integer
        System.out.println("Give an integer:");
        int numero = Integer.valueOf(scan.nextLine());

        //terceiro input. double
        System.out.println("Give a double:");
        Double quebrado = Double.valueOf(scan.nextLine());

        //quarto input, boolean
        System.out.println("Give a boolean:");
        Boolean verdade = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + texto);
        System.out.println("You gave the integer " + numero);
        System.out.println("You gave the double " + quebrado);
        System.out.println("You gave the boolean " + verdade);


    }
}
