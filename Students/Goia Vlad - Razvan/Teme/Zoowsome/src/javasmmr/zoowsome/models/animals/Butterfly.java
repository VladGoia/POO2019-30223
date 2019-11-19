package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

    public Butterfly(double maintenanceCost,double dangerPerc) {
    	super(maintenanceCost, dangerPerc);
        setNrOfLegs(4);
        setName("Rhopalocera");
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