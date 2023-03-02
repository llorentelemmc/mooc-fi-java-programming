
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                break;
            }

            if (command.equalsIgnoreCase("add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scanner.nextLine();
                birds.add(new Bird(name, latinName));
            }

            if (command.equalsIgnoreCase("observation")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                Bird queriedBird = birds.stream().filter(bird -> bird.getName().equalsIgnoreCase(name)).findAny().orElse(null);

                if (queriedBird == null) {
                    System.out.println("Not a bird!");
                } else {
                    queriedBird.addObservation();
                }
            }
            if (command.equalsIgnoreCase("all")) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }

            if (command.equalsIgnoreCase("one")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                for (Bird bird : birds) {
                    if (bird.getName().equals(name)) {
                        System.out.println(bird);
                    }
                }

            }
        }
    }
}
