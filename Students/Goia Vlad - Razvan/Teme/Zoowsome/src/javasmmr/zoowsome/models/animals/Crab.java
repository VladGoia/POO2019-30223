package javasmmr.zoowsome.models.animals;

public class Crab extends Aquatic {

    public Crab(double maintenanceCost, double dangerPerc) {
    	super(maintenanceCost, dangerPerc);
        setNrOfLegs(8);
        setName("Liocarcinus vernalis");
        setAverageSwimDepth(10);
        setWaterType(WaterType.FRESHWATER);
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