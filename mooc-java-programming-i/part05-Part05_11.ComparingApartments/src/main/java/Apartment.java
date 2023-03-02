
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
            return false;
    }

    public int priceDifference(Apartment compared) {
        int ownApt = this.pricePerSquare * this.squares;
        int comparedApt = compared.pricePerSquare * compared.squares;
        int difference = ownApt - comparedApt;
        return Math.abs(difference);
    }
    public boolean moreExpensiveThan(Apartment compared) {
        int ownApt = this.pricePerSquare * this.squares;
        int comparedApt = compared.pricePerSquare * compared.squares;
        if (ownApt > comparedApt) {
            return true;
        }
        return false;
    }
}

