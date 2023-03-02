

public class Division {

    public static void main(String[] args) {

        division(3, 5);
        // should print "0.6"
    }

    public static void division(int numerator, int denominator) {
        double result = (double) numerator / denominator;
        System.out.println(result);
    }
}

