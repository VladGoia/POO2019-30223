package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Insect extends Animal {
    private Boolean canFly;
    private Boolean isDangerous;

    public Insect(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
    
    public Boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }
    
    public void setIsDangerous(Boolean dangerous) {
        isDangerous = dangerous;
    }

    public Boolean getDangerous() {
        return isDangerous;
    }
    
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(this.getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(this.getDangerous()));
	}
	
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}