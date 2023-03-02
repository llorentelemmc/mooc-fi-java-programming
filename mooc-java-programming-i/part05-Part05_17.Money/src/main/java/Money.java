
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {

        return this.euros;
    }

    public int cents() {

        return this.cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        return new Money(newEuros, newCents);

    }

    public boolean lessThan(Money compared) {
        //first compare euros
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }


    public Money minus(Money decreaser) {
        if (this.euros - decreaser.euros >= 0 && this.cents - decreaser.cents >= 0) {
            int newEuros = this.euros - decreaser.euros;
            int newCents = this.cents - decreaser.cents;
            Money newMoney = new Money(newEuros, newCents);
            return newMoney;
        } else if (this.cents - decreaser.cents < 0) {
            int newEuros = (this.euros - decreaser.euros) - 1;
            int newCents = 100 + (this.cents - decreaser.cents);
            if (newEuros >= 0) {
                Money newMoney = new Money(newEuros, newCents);
                return newMoney;
            }
        }
        Money newMoney = new Money(0, 0);
        return newMoney;

    }


    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
