package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {

    public Tiger(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(4);
        setName("Panthera tigris");
        setNormalBodyTemperature((float) 36.4);
        setPercentBodyHair((float) 99.5);
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