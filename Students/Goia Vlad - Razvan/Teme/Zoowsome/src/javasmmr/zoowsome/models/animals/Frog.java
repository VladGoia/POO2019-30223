package javasmmr.zoowsome.models.animals;

public class Frog extends Aquatic {

    public Frog(double maintenanceCost, double dangerPerc) {
        	super(maintenanceCost, dangerPerc);
            setNrOfLegs(4);
            setName("Agalychnis callidryas");
            setAverageSwimDepth(50);
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