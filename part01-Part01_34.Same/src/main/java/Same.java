
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String resposta1 = reader.nextLine();

        System.out.println("Enter the second string:");
        String resposta2 = reader.nextLine();

        if (resposta1.equals(resposta2)) {
            System.out.println("Same");
        } else{
            System.out.println("Different");
        }

    }
}
