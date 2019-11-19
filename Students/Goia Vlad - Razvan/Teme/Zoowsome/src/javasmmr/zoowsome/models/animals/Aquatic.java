package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
    private Integer averageSwimDepth;
    private WaterType waterType;

    public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
    
    public Integer getAverageSwimDepth() {
        return averageSwimDepth;
    }

    public void setAverageSwimDepth(Integer averageSwimDepth) {
        this.averageSwimDepth = averageSwimDepth;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }
}