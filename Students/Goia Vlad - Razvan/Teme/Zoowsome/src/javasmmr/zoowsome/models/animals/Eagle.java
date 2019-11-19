package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {

    public Eagle(double maintenanceCost, double dangerPerc) 
    {
    	super(maintenanceCost, dangerPerc);
        setNrOfLegs(2);
        setName("Aquila");
        setMigrates(false);
        setAverageFlightAltitude(3000);
    }

    public boolean kill() {
		double randomNr = Math.random();
		if (randomNr < this.getDangerPerc()) {
			return true;
		} else {
			return false;
		}
	}
}