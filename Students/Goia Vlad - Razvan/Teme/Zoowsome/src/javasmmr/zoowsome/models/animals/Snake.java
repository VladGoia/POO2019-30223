package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {

    public Snake(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(0);
        setName("Python molurus");
        setLaysEggs(true);
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