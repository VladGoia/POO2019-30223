package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public abstract class Animal implements Killer, XML_Parsable{
	private String name;
	private Integer nrOfLegs;
	private Boolean takenCareOf;
	protected double maintenanceCost;
	protected double dangerPerc;

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
	
	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}
	
	public void setDangerPerc(double dangerPerc) {
		this.dangerPerc = dangerPerc;
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
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}
	
	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
}