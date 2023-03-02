import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {

        if (this.gifts.isEmpty()) {
            return -1;
        }
        int sumOfWeights = 0;
        for (Gift gift: this.gifts) {
            sumOfWeights = sumOfWeights + gift.getWeight();
        }
        return sumOfWeights;
    }
}
