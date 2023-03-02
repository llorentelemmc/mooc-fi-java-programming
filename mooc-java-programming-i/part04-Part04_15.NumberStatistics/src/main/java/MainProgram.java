
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics evens = new Statistics();
        Statistics odds = new Statistics();


        System.out.println("Enter numbers:");

        while (true) {
            int value = Integer.valueOf(scanner.nextLine());

            if (value == -1) {
                break;
            }

            statistics.addNumber(value);

            if (value % 2 == 0) {
                evens.addNumber(value);
                } else {
                    odds.addNumber(value);
                }

            }


        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evens.sum());
        System.out.println("Sum of odd numbers: " + odds.sum());


    }
}
