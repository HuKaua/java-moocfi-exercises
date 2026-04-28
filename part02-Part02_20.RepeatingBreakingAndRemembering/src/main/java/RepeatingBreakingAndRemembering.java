
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double cont = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                System.out.println("Give numbers:");
                break;
            }else{
                sum += number;
                cont++;
                average = sum / cont;
                if (number % 2 ==0) {
                    even ++;
                }else{
                    odd ++;
                    continue;
                }
                
            } 
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + cont + 1);
        System.out.println("average: " + average);
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);

    }
}
