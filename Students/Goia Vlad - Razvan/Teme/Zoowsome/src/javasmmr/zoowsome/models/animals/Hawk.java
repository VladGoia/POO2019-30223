package javasmmr.zoowsome.models.animals;

public class Hawk extends Bird {

    public Hawk() {
        setNumberOfLegs(2);
        setName("Accipiter");
        setMigrates(false);
        setAverageFlightAltitude(3500);
    }

    public Hawk(
            Integer numberOfLegs,
            String name,
            Boolean migrates,
            Integer averageFlightAltitude) {
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setMigrates(migrates);
        setAverageFlightAltitude(averageFlightAltitude);
    }
}