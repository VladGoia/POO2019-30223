package javasmmr.zoowsome.models.animals;

public class Gecko extends Reptile {

    public Gecko
        (double maintenanceCost, double dangerPerc) {
        	super(maintenanceCost, dangerPerc);
            setNrOfLegs(4);
            setName("Eublepharis macularius");
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