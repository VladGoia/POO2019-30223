package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

    public Cow(double maintenanceCost, double dangerPerc) {
    	super(maintenanceCost, dangerPerc);
        setNrOfLegs(4);
        setName("Bos taurus");
        setNormalBodyTemperature((float) 39.9);
        setPercentBodyHair((float) 99.7);
        
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