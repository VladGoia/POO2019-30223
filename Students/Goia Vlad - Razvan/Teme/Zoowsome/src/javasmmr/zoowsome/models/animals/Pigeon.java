package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird {

    public Pigeon(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(2);
        setName("Columba livia");
        setMigrates(false);
        setAverageFlightAltitude(1050);
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