
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                list.add(Integer.valueOf(fileReader.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        ArrayList<Integer> listInRange = new ArrayList<>();
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) <= upperBound && list.get(i) >= lowerBound){
                listInRange.add(list.get(i));
            }
            i++;
        }

        System.out.println("Numbers: " + listInRange.size());
    }

}

