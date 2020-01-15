package model;

public class Pacient {
	private String nume;
	private String prenume;
	private int varsta;
	private String sex;
	
	public Pacient(String data)
	{
		String arrStr[] = data.split(" ");
		this.nume = arrStr[0];
		this.prenume = arrStr[1];
		this.varsta = Integer.valueOf(arrStr[2]);
		this.sex = arrStr[3];
	}
	
	public Pacient(String nume, String prenume, int varsta, String sex) 
	{
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.sex = sex;
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
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
