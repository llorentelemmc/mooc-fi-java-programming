public class Entry {

    private String identifier;
    private String name;


    public Entry(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }


    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Entry)) {
            return false;
        }

        // convert the object to a Entry object
        Entry comparedEntry = (Entry) compared;


        // if the values of the object variables are equal, the objects are, too

        if (this.identifier.equals(comparedEntry.identifier)) {
            return true;
        }

        // otherwise the objects are not equal
        return false;

    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
