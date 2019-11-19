package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

    public Spider(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("Araneae");
		setNrOfLegs(8);
		setCanFly(false);
		setDangerous(true);
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