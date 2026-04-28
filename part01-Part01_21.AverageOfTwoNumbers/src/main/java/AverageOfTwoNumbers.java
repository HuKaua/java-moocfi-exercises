
import java.util.Base64;
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int n1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int n2 = Integer.valueOf(scanner.nextLine());

        double average = (n1 + n2)/2;
    

        System.out.println("The average is " + average);

    }
}
