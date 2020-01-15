package model;

public class Medicament {
	private String denumire;
	private String producator;
	private int pret;
	private int gramaj;
	
	public Medicament(String data) {
		
		String arrStr[] = data.split(" ");
		this.denumire = arrStr[0];
		this.producator = arrStr[1];
		this.pret = Integer.valueOf(arrStr[2]);
		this.gramaj = Integer.valueOf(arrStr[3]);
	}
	
	public Medicament(String denumire, String producator, int pret, int gramaj)
	{
		this.denumire = denumire;
		this.producator = producator;
		this.pret = pret;
		this.gramaj = gramaj;
	}

	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public String getProducator() {
		return producator;
	}
	public void setProducator(String producator) {
		this.producator = producator;
	}
	public int getPret() {
		return pret;
	}
	public void setPret(int pret) {
		this.pret = pret;
	}
	public int getGramaj() {
		return gramaj;
	}
	public void setGramaj(int gramaj) {
		this.gramaj = gramaj;
	}
	
}
