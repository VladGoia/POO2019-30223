package javasmmr.simhotel;

public class Hotel {
	public Client[] listaClienti;
	private Angajat[] listaAngajati;
	private Camera[] listaCamere;
	private int nrClienti;
	private int nrAngajati;
	private int nrCamere;
	public Hotel() 
	{
		this.nrClienti = 0;
		this.nrAngajati = 0;
		this.nrCamere = 0;
		this.listaClienti = new Client[1000];
		this.listaAngajati = new Angajat[1000];
		this.listaCamere = new Camera[1000];
	}

		public void addClient(Client c1) 
		{
			this.listaClienti[this.nrClienti++] = c1;
		}
		public void addAngajat(Angajat a1) 
		{
			this.listaAngajati[this.nrAngajati++] = a1;
		}
		public void addCamera(Camera r1) 
		{
			this.listaCamere[this.nrCamere++] = r1;
		}
		public void listClienti() 
		{
			for (int i = 0; i < this.nrClienti; i++) 
			{
				if (this.listaClienti[i] instanceof Client)
					System.out.print(this.listaClienti[i].nume + " , ");
			}
		}
		public void listAngajati() 
		{
			for (int i = 0; i < this.nrAngajati; i++) 
			{
				if (this.listaAngajati[i] instanceof Angajat)
					System.out.print(this.listaAngajati[i].nume + " , ");
			}
		}
		public void listCamere() 
		{
			for (int i = 0; i < this.nrCamere; i++) 
			{
				if (this.listaCamere[i] instanceof Camera)
					System.out.print(this.listaCamere[i].cameraId + " , ");
			}
		}
		public int emitereFactura(Client c1, Camera r1) {
			int factura = c1.nrNopti * r1.pretNoapte;
			return factura;
		}

}


