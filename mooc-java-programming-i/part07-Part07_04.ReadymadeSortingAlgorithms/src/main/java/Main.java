import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] numberArray = {3, 1, 5, 99, 3, 12};
        sort(numberArray);

        String[] carsArray = {"Volvo", "BMW", "Ford", "Mazda"};
        sort(carsArray);

        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(3);
        numberList.add(1);
        numberList.add(5);
        numberList.add(99);
        numberList.add(3);
        numberList.add(12);
        sortIntegers(numberList);

        ArrayList<String> carsList = new ArrayList<String>();
        carsList.add("Volvo");
        carsList.add("BMW");
        carsList.add("Ford");
        carsList.add("Mazda");
        sortStrings(carsList);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void sort(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
        System.out.println(integers);
    }
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
        System.out.println(strings);

    }


}
