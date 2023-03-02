
public class SumOfArray {

    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] foo) {
        int i = 0;
        int sum = 0;
        while (i < foo.length) {
            sum = foo[i] + sum;
            i++;

        }
        return sum;
    }
}
