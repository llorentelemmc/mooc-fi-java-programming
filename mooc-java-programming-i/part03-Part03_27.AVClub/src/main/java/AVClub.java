
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("")) {
            String[] pieces = input.split(" ");
            for (int i = 0; i < pieces.length; i++) {

                if (pieces[i].contains("av")) {
                    System.out.println(pieces[i]);
                }
            }
            input = scanner.nextLine();
        }
    }
}



/*

import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("")) {
            String[] pieces = input.split(" ");
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
            input = scanner.nextLine();
        }
    }
}
*/
