public class Timer {

    private ClockHand seconds;
    private ClockHand tenMilliseconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.tenMilliseconds = new ClockHand(100);
    }

    public void advance() {
        this.tenMilliseconds.advance();

        if (this.tenMilliseconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + tenMilliseconds;
    }

}
