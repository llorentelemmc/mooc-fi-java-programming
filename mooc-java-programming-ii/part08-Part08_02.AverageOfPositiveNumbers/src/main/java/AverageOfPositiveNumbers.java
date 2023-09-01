
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfValues = 0;
        int sumOfValues = 0;

        while (true) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {

                numberOfValues = numberOfValues + 1;

                sumOfValues = number + sumOfValues;

            }
        }


        if (numberOfValues > 0) {
            double average = 1.0 * sumOfValues / numberOfValues;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
