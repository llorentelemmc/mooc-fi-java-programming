import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.currentWeight = 0;
    }

    public void addItem(Item item) {
        if (this.currentWeight + item.getWeight() <= this.maxWeight) {
            items.add(item);
            currentWeight = currentWeight + item.getWeight();
        }
    }

    public void printItems(){

        if (!(this.items.isEmpty())) {
            for (Item item : this.items) {
                System.out.println(item);
            }
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        int heaviestWeight = 0;
        Item heaviestItem = this.items.get(0);
        for (Item item : this.items) {
            if (heaviestWeight < item.getWeight()) {
                heaviestWeight = item.getWeight();
                heaviestItem = item;

            }
        }
        return heaviestItem;
    }

    public String toString() {
        if (items.size() == 0) {
            return "no items (" + currentWeight + " kg)";
        }
        if (items.size() == 1) {
            return "1 item (" + currentWeight + " kg)";
        }
        return items.size() + " items (" + currentWeight + " kg)";
    }
}
