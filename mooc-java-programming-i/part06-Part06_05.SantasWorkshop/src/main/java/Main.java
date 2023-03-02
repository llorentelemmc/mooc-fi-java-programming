
public class Main {

    public static void main(String[] args) {

        Gift firstBook = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift secondBook = new Gift("foo", 5);

        Package gifts = new Package();
        gifts.addGift(firstBook);
        gifts.addGift(secondBook);
        System.out.println(gifts.totalWeight());

    }
}
