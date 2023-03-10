
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sum = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0];
            if (longestName.length() < name.length()) {
                longestName = name;
            }
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
