package javasmmr.simhotel;

public class Angajat extends Persoana{
	
	public String dataAngajare;
	public int nrClienti;

	public Angajat(String nume, String nrTel, int persId, String dataAngajare, int nrClienti) {
		super.persId = persId;
		super.nrTel = nrTel;
		super.nume = nume;
		this.dataAngajare = dataAngajare;
		this.nrClienti = nrClienti;
	}
	public int getNrClienti (int nrClienti) {
		return nrClienti;
	}
	public int getDataAngajare (int dataAngajare) {
		return dataAngajare;
	}
	
}
