package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {

    private Float normalBodyTemperature;
    private Float percentBodyHair;

    public Mammal(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
    
    public Float getPercentBodyHair() {
        return percentBodyHair;
    }

    public void setPercentBodyHair(Float percentBodyHair) {
        this.percentBodyHair = percentBodyHair;
    }

    public Float getNormalBodyTemperature() {
        return normalBodyTemperature;
    }

    public void setNormalBodyTemperature(Float normalBodyTemperature) {
        this.normalBodyTemperature = normalBodyTemperature;
    }
}