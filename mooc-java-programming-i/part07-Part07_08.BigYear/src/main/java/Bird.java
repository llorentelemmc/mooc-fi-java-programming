public class Bird {

    private String name;
    private String latinName;
    private int observations;


    public Bird(String name, String latinName) {
        this(name, latinName, 0);
        //here the code of the second constructor is run, and observations is set to 0
    }

    public Bird(String name, String latinName, int observations) {
        this.name = name;
        this.latinName = latinName;
        this.observations = observations;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void addObservation() {
        this.observations++;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.latinName + "): " + this.observations + " observations";
    }


}
