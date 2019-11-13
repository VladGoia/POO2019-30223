package javasmmr.simhotel;

public class Camera {

	public int cameraId;
	public int capacitate;
	public int pretNoapte;
	public static int pretSpecial = 100;
	
	public Camera(int cameraId, int capacitate, int pretNoapte) {
		this.cameraId = cameraId;
		this.capacitate = capacitate;
		this.pretNoapte = pretNoapte;
	}
}
