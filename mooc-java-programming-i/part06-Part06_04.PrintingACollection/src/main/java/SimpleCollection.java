
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {

        this.elements.add(element);
    }

    public ArrayList<String> getElements() {

        return this.elements;
    }

    public String toString() {

        String collectedElements = "";
        String collectedOneElement = "";

        for (String element: elements) {
            collectedElements = collectedElements + element + "\n";
        }

        for (String element: elements) {
            collectedOneElement = collectedOneElement + element;
        }

        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else if (this.elements.size() == 1){
            return "The collection " + this.name + " has " + this.elements.size() + " element:" + "\n" + collectedOneElement;
        } else {
            return  "The collection " + this.name + " has " + this.elements.size() + " elements:" + "\n" + collectedElements;
        }
    }
}
