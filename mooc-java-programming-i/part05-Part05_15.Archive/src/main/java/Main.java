
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Entry> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");

            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");

            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Entry entry = new Entry(identifier, name);
            if (!(archive.contains(entry))) {
                archive.add(entry);
            }

        }

        System.out.println("==Items==");
        for (Entry entry : archive)
        {
            System.out.println(entry);
        }

    }
}

