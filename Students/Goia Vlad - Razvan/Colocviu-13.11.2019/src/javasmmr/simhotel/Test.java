package javasmmr.simhotel;

public class Test {
	public static void main(String[] args) {
	Hotel hotel = new Hotel();
	Persoana[] persoana  = new Persoana[20];
	Camera[] camera = new Camera[15];
	persoana[0] = new Client("Pop Vasile","0744470612", 2001, 1, 0, "3.12.2019", "7.12.2019");
	persoana[1] = new Angajat("Gouaru Radu","0744470612", 1001, "13.11.2019", 7);
	persoana[2] = new Client("Dorian Popa","0748158142", 2002, 2, 0, "12.1.2019", "17.1.2019");
	persoana[3] = new Angajat("Boia Vlad","0776693612", 1002, "13.11.2019", 11);
	persoana[4] = new Client("Mircea Rus","0786872612", 2003, 3, 0, "30.2.2019", "4.3.2019");
	persoana[5] = new Angajat("Chiras Valentin","0763470612", 1003, "3.10.2018", 100);
	persoana[6] = new Client("Pop Vasile","0709341612", 2004, 4, 0, "3.12.2019", "7.12.2019");
	persoana[7] = new Angajat("Garbou Raul","0562309624", 1004, "1.1.2019", 49);
	camera[0] = new Camera(102,2,150);
	camera[1] = new Camera(101,2,150);
	
	Client VasilePop = new Client("Pop Vasile","0744470612", 2001, 1, 0, "3.12.2019", "7.12.2019");
	Client DorianPopa = new Client("Dorian Popa","0748158142", 2002, 2, 0, "12.1.2019", "17.1.2019");
	Angajat GouaruRadu = new Angajat("Gouaru Radu","0744470612", 1001, "13.11.2019", 7);
	DorianPopa.nrCamera = camera[1].cameraId;
	VasilePop.nrCamera = camera[0].cameraId;
	hotel.addClient(DorianPopa);
	hotel.addClient(VasilePop);
	hotel.addAngajat(GouaruRadu);
	System.out.println("Client " + VasilePop.nume + " se afla in camera " + VasilePop.nrCamera);
	System.out.println("Client " + DorianPopa.nume + " se afla in camera " + DorianPopa.nrCamera);
	VasilePop.nrNopti = 4;
	System.out.println(hotel.emitereFactura(VasilePop, camera[0]) + " Ron");
	System.out.println("Clienti: ");
	hotel.listClienti();
	System.out.println("");
	System.out.println("Angajati: ");
	hotel.listAngajati();
	}

}
