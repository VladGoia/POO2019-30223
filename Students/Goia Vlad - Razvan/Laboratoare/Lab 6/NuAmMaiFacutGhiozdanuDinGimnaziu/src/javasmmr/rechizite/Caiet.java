package javasmmr.rechizite;

public class Caiet extends Rechizite {
	public Caiet(String eticheta)
	{
		this.eticheta = eticheta;
	}

	public String getName() 
	{
		return super.eticheta + "Caiet";
	}

} 