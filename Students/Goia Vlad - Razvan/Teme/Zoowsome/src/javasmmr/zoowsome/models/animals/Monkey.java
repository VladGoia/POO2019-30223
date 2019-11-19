package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {

    public Monkey(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(4);
        setName("Callithrix jacchus");
        setNormalBodyTemperature((float) 37.9);
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