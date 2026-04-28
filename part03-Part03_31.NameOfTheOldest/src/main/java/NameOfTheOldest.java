
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int older = 0;
        String olderName ="0";
        int tamanho = 0;
        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;

            } else {
                String [] pieces = text.split(",");
                int currentAge = Integer.parseInt(pieces[1]);
                    if (currentAge > older) {
                        older = currentAge;
                        olderName = pieces[0];
                    }
                }
                System.out.println(olderName);
            }

        }

    }

