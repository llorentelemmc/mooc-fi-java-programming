
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube chonkyCube = new Cube(18);
        System.out.println(chonkyCube.volume());
        System.out.println(chonkyCube);
    }
}
