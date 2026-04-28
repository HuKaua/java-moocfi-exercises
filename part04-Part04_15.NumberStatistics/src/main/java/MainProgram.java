import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create 3 independent objects (buckets)
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            // 1. Add to the "All" bucket
            allNumbers.addNumber(input);

            // 2. Check logic and distribute to Even or Odd buckets
            if (input % 2 == 0) {
                evenNumbers.addNumber(input);
            } else {
                oddNumbers.addNumber(input);
            }
        }

        // Print results getting data from each specific object
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
}







