import java.util.ArrayList;

public class Room {

    private ArrayList<Person> crowd;

    public Room() {
        this.crowd = new ArrayList<>();
    }

    public void add(Person person) {
        this.crowd.add(person);
    }

    public boolean isEmpty() {
        return this.crowd.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.crowd;
    }

    public Person shortest() {
        if (this.crowd.isEmpty()) {
            return null;
        }
        Person smallestPerson = this.crowd.get(0);
        for (Person person : this.crowd) {
            if (smallestPerson.getHeight() > person.getHeight()) {
                smallestPerson = person;
            }
        }
        return smallestPerson;
    }

    public Person take() {
        if (this.crowd.isEmpty()) {
            return null;
        }

        /*Person smallestPerson = this.crowd.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < this.crowd.size(); i++) {
            if (smallestPerson.getHeight() > this.crowd.get(i).getHeight()) {
                smallestPerson = this.crowd.get(i);
                smallestIndex = i;
            }
        }
        this.crowd.remove(smallestIndex);
        return smallestPerson;*/

        Person shortestPerson = shortest();
        this.crowd.remove(shortestPerson);
        return shortestPerson;
    }
}
