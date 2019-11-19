package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {

    public Crocodile(double maintenanceCost, double dangerPerc) {
    	super(maintenanceCost, dangerPerc);
        setNrOfLegs(4);
        setName("Crocodylus niloticus");
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