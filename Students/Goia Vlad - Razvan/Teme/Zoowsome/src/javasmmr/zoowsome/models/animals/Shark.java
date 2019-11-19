package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

    public Shark(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(0);
        setName("Rhincodon typus");
        setAverageSwimDepth(1800);
        setWaterType(WaterType.SALTWATER);
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