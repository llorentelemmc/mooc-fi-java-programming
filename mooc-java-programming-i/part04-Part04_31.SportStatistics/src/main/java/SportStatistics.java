
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String filename = scan.nextLine();

        ArrayList<Game> games = readGames(filename);

        System.out.println("Team:");
        String team = scan.nextLine();

        int i = 0;
        for (Game game : games) {
            if (game.getHomeTeam().contains(team) || game.getVisitingTeam().contains(team)) {
                i++;
            }

        }

        System.out.println("Games: " + i);

        int wins = 0;
        int losses = 0;
        for (Game game : games) {
            if (game.getHomeTeam().contains(team) && game.getHomePoints() > game.getVisitingPoints()) {
                wins++;
            } else if (game.getHomeTeam().contains(team) && game.getHomePoints() < game.getVisitingPoints()) {
                losses++;
            } else if (game.getVisitingTeam().contains(team) && game.getVisitingPoints() > game.getHomePoints()) {
                wins++;
            } else if (game.getVisitingTeam().contains(team) && game.getVisitingPoints() < game.getHomePoints()) {
                losses++;
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Game> readGames(String file) {
        ArrayList<Game> games = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeam, visitingTeam, homePoints, visitingPoints));

            }

        } catch (Exception e) {

            System.out.println("Could not read " + file);
        }

        return games;
    }

}

