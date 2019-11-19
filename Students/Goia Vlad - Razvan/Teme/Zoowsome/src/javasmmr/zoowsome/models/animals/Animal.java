package javasmmr.zoowsome.models.animals;

public abstract class Animal implements Killer {
	private String name;
	private Integer nrOfLegs;
	private Boolean takenCareOf;
	protected final double maintenanceCost;
	protected final double dangerPerc;

	public Animal(double maintenanceCost, double dangerPerc) {
		this.dangerPerc = dangerPerc;
		this.maintenanceCost = maintenanceCost;
		this.takenCareOf = false;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public Integer getNrOfLegs() {
		return this.nrOfLegs;
	}

	public String getName() {
		return this.name;
	}

	public Boolean getTakenCareOf() {
		return this.takenCareOf;
	}


	public double getDangerPerc() {
		return this.dangerPerc;
	}

	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}
}