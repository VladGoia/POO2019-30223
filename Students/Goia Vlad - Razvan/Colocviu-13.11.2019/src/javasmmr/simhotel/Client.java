package javasmmr.simhotel;

public class Client extends Persoana{
	
	public int clientId;
	public int nrCamera;
	public String checkIn;
	public String checkOut;
	public int nrNopti;

	public Client(String nume, String nrTel, int persId, int clientId, int nrCamera, String checkIn, String checkOut) {
		super.persId = persId;
		super.nrTel = nrTel;
		super.nume = nume;
		this.clientId = clientId;
		this.nrCamera = nrCamera;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
}
