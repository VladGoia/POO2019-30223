package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Eagle extends Bird {

    public Eagle(double maintenanceCost, double dangerPerc) 
    {
    	super(maintenanceCost, dangerPerc);
        setNrOfLegs(2);
        setName("Aquila");
        setMigrates(false);
        setAverageFlightAltitude(3000);
    }

    public boolean kill() {
		double randomNr = Math.random();
		if (randomNr < this.getDangerPerc()) {
			return true;
		} else {
			return false;
		}
	}
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Eagle);
	}
}