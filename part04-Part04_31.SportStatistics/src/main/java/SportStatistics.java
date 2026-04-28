
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> teamList = new ArrayList<>();
        int wins = 0;
        int losses = 0;
        int games = 0;

        System.out.println("File: ");
        String file = scanner.nextLine();

        System.out.println("Team: ");
        String teamName = scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))){
         while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();

            String[] parts = line.split(",");
            String home = parts[0];
            String away = parts [1];
            int homePoints = Integer.valueOf(parts[2]);
            int awayPoints = Integer.valueOf(parts[3]);

            if (home.equals(teamName) || away.equals(teamName)) {
                    games++;

                    if (home.equals(teamName) && homePoints > awayPoints) {
                        wins++;
                    } else if (away.equals(teamName) && awayPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
            
                }
        
        }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error reading file: " + e.getMessage());
        }


    }

}
