
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                if (firstContainer + amount <= 100) {
                    firstContainer = firstContainer + amount;
                } else {
                    firstContainer = 100;
                }
            }

            if (command.equals("move")) {

                if (amount > firstContainer) {
                    if (firstContainer + secondContainer > 100) {
                        secondContainer = 100;
                        firstContainer = 0;
                    } else {
                        secondContainer = secondContainer + firstContainer;
                        firstContainer = 0;
                    }
                } else {
                    if (amount + secondContainer > 100) {
                        secondContainer = 100;
                        firstContainer = firstContainer - amount;
                    } else {
                        secondContainer = secondContainer + amount;
                        firstContainer = firstContainer - amount;
                    }
                }
            }

            if (command.equals("remove")) {
                if (amount > secondContainer) {
                    secondContainer = 0;
                } else {
                    secondContainer = secondContainer - amount;
                }
            }
        }
    }

}
