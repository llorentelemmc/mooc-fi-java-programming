

public class Film {
    private String name;
    private int ageRating;

    public Film(String filmName, int filmAgeRating) {
        this.ageRating = filmAgeRating;
        this.name = filmName;
    }
    public String name() {
        return name;
    }
    public int ageRating() {
        return ageRating;
    }
}
