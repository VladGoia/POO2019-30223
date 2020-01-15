package model;
import java.util.HashMap;

public class Farmacie {
	private String denumire;
	private String adresa;
	private String nrtelefon;
	private String website;
	private HashMap<String, Integer> stocMedicamente;
	private HashMap<String, Integer> reteteProcesate;
	
	public Farmacie(String denumirea, String adresa, String nrtelefon, String website,
			HashMap<String, Integer> stocMedicamente,HashMap<String, Integer> reteteProcesate)
	{
		this.denumire = denumirea;
		this.adresa = adresa;
		this.nrtelefon = nrtelefon;
		this.website = website;
		this.stocMedicamente = stocMedicamente;
		this.reteteProcesate = reteteProcesate;
	}
	
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getNrtelefon() {
		return nrtelefon;
	}
	public void setNrtelefon(String nrtelefon) {
		this.nrtelefon = nrtelefon;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public HashMap<String, Integer> getStocMedicamente() {
		return stocMedicamente;
	}
	public void setStocMedicamente(HashMap<String, Integer> stocMedicamente) {
		this.stocMedicamente = stocMedicamente;
	}
	public HashMap<String, Integer> getReteteProcesate() {
		return reteteProcesate;
	}
	public void setReteteProcesate(HashMap<String, Integer> reteteProcesate) {
		this.reteteProcesate = reteteProcesate;
	}
}
