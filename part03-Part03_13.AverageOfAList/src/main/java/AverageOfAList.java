
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while (true) {
            Double input = Double.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        double soma = 0;

        for (Double num : list) {
            soma += num;
        }
    
        double div = soma / list.size();
        System.out.println("Average: " + div);
    }
}
