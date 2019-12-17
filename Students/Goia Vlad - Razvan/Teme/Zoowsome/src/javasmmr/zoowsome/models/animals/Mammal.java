package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

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

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(this.getNormalBodyTemperature()));
		createNode(eventWriter, "perBodyHair", String.valueOf(this.getPercentBodyHair()));
	}
	
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setNormalBodyTemperature(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercentBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}