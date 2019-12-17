package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	private WaterType waterType;
	
	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	public void setAverageSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public void setWaterType(WaterType freshwater) {
		this.waterType = freshwater;
	}
	
	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	
	public WaterType getWaterType() {
		return this.waterType;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(this.getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(this.getWaterType()));
	}
	
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setAverageSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(WaterType.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
	
}