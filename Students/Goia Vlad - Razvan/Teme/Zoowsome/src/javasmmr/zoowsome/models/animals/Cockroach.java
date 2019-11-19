package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {

    public Cockroach(double maintenanceCost, double dangerPerc) {
    	super(maintenanceCost, dangerPerc);
        setNrOfLegs(6);
        setName("Phylum Arthropoda");
        setCanFly(true);
        setDangerous(false);
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