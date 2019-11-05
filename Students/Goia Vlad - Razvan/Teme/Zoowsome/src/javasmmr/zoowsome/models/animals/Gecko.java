package javasmmr.zoowsome.models.animals;

public class Gecko extends Reptile {

    public Gecko() {
        setNumberOfLegs(4);
        setName("Eublepharis macularius");
        setLaysEggs(true);
    }

    public Gecko(
            Integer numberOfLegs,
            String name,
            Boolean laysEggs) {
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setLaysEggs(laysEggs);
    }
}