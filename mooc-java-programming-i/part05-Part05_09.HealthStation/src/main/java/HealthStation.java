
public class HealthStation {

    private int weighings;

    public HealthStation() {
        this.weighings = 0;
    }

    public int weigh(Person person) {
        if (person.getWeight() > 0) {
            this.weighings++;
            return person.getWeight();
        }
        return -1;
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.weighings;
    }

}
