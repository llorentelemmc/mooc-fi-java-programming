
public class Main {

    public static void main(String[] args) {
        SimpleDate test = new SimpleDate(29, 12, 1995);
        System.out.println(test);
        test.advance(6);
        System.out.println(test);
        test.advance();
        System.out.println(test);

        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }
    }
}
