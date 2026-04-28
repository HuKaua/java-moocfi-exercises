
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int count = 0;
        int length = 0;
        int sumOfYears = 0;
        double average= 0;
        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;

            } else {
                String [] pieces = text.split(",");
                String name = pieces[0];
                int year = Integer.parseInt(pieces[1]);
                sumOfYears += year;
                count++;
                if (name.length()>longestName.length()) { 
                    longestName = name;


                }
                
                }
                if (count > 0) {
                    average = sumOfYears / count;

                }
                System.out.println(longestName);
                System.out.println(average);
            }
        }        


    }

