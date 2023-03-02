import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        /*System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(MainProgram.newArray(numbers, 2)));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));*/

        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int number : array) {
            if (smallest > number) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = MainProgram.smallest(array);
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                index = i;
                break;
            }
        }

        return index;

    }

    public static int[] newArray(int[] array, int startIndex) {
        int[] newArray = new int[array.length - (startIndex)];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[startIndex];
            startIndex++;
        }
        return newArray;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int[] newArray = MainProgram.newArray(array, startIndex);
        int smallest = MainProgram.smallest(newArray);
        int index = 0;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] == smallest) {
                index = i;
                break;
            }
        }

        return index;

    }

    public static void swap(int[] array, int index1, int index2) {
        int a;
        int b;
        a = array[index1];
        b = array[index2];
        array[index1] = b;
        array[index2] = a;
    }

    public static void sort(int[] array) {

        System.out.println(Arrays.toString(array));
        int startIndex = 0;
        for (int i = 0; i < array.length; i++) {
            MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, startIndex));
            startIndex++;
            System.out.println(Arrays.toString(array));

        }

    }

}
