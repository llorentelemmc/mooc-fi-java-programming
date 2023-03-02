
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(1);
        counter.increase(7);
        counter.increase(8);
        counter.decrease(10);
        counter.decrease();
        System.out.println(counter.value());
    }
}
