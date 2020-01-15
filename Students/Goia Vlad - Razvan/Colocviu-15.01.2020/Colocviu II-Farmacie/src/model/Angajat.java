package model;
import java.util.Date;

public class Angajat {
	private String nume;
	private String prenume;
	private int ID;
	private Date dataAngajare;
	private int bonusSalariu;
	
	public Angajat(String nume, String prenume, int ID, Date dataAngajare, int bonusSalariu)
	{
		this.nume = nume;
		this.prenume = prenume;
		this.ID = ID;
		this.dataAngajare = dataAngajare;
		this.bonusSalariu = bonusSalariu;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getDataAngajare() {
		return dataAngajare;
	}
	public void setDataAngajare(Date dataAngajare) {
		this.dataAngajare = dataAngajare;
	}
	public int getBonusSalariu() {
		return bonusSalariu;
	}
	public void setBonusSalariu(int bonusSalariu) {
		this.bonusSalariu = bonusSalariu;
	}

}
