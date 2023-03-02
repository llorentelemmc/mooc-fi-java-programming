
public class Statistics {

    private int sum;
    private int count;

    public Statistics() {
        this.sum = 0;
        this.count = 0;
    }

    public void addNumber(int number) {
        this.sum = this.sum + number;
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.sum > 0) {
            return 1.0 * sum() / getCount();
        } else {
            return 0;
        }
    }
}