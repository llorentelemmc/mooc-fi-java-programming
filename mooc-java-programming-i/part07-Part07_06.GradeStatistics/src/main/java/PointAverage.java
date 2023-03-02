import java.util.Scanner;
import java.util.ArrayList;

public class PointAverage {

    private Scanner scanner;
    private int total;
    private int counter;
    private int passingTotal;
    private int passingCounter;
    private ArrayList<Integer> grades;


    public PointAverage() {
        this.scanner = new Scanner(System.in);
        this.total = 0;
        this.counter = 0;
        this.passingTotal = 0;
        this.passingCounter = 0;
        this.grades = new ArrayList<>();
    }

    public void start() {
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            } else if (input <= -2 || input >= 101) {
                continue;
            } else {
                total = total + input;
                counter = counter + 1;
                if (input >= 50) {
                    passingTotal = passingTotal + input;
                    passingCounter = passingCounter + 1;
                }

            }

            int grade = grade(input);
            grades.add(grade);
        }

        double average = (1.0 * total) / counter;
        double passingAverage = (1.0 * passingTotal) / passingCounter;
        double passingPercentage = ((1.0 * passingCounter) / counter) * 100;
        System.out.println("Point average (all): " + average);
        System.out.println("Point average (passing): " + passingAverage);
        System.out.println("Pass percentage): " + passingPercentage);
        printGradeDistribution();


    }

    public int grade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        System.out.println("Grade distribution:");
        while (grade >= 0) {
            int stars = numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }



}
