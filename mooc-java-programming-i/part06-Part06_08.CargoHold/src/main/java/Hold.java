import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> cases;
    private int maxWeight;
    private int currentWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.cases = new ArrayList<>();
        this.currentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight + suitcase.totalWeight() <= this.maxWeight) {
            cases.add(suitcase);
            currentWeight = currentWeight + suitcase.totalWeight();
        }
    }

    public String toString() {
        if (cases.size() == 0) {
            return "no suitcases (" + currentWeight + " kg)";
        }
        if (cases.size() == 1) {
            return "1 suitcase (" + currentWeight + " kg)";
        }
        return cases.size() + " suitcases (" + currentWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.cases) {
            suitcase.printItems();
        }

    }

}
