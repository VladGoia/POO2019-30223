package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {

    public Eagle() 
    {
        setNumberOfLegs(2);
        setName("Aquila");
        setMigrates(false);
        setAverageFlightAltitude(3000);
    }

    public Eagle(
            Integer numberOfLegs,
            String name,
            Boolean migrates,
            Integer averageFlightAltitude) 
    {
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setMigrates(migrates);
        setAverageFlightAltitude(averageFlightAltitude);
    }

}