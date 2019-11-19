package javasmmr.zoowsome.models.animals;

public class Hawk extends Bird {

    public Hawk(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(2);
        setName("Accipiter");
        setMigrates(false);
        setAverageFlightAltitude(3500);
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