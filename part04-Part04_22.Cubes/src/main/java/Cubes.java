
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String numero = scanner.nextLine();
        
            if (numero.equals("end")) {
                break;

            }
            int numero1 = Integer.valueOf(numero);
            int cubica = numero1 * numero1 * numero1;
            System.out.println(cubica);

            
        }

    }
}