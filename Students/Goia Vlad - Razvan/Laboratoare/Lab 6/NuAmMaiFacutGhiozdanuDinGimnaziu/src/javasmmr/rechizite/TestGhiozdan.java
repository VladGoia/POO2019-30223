package javasmmr.rechizite;

public class TestGhiozdan {
	public static void main(String[] args) {
		Rechizite[] rechizite = new Rechizite[20];
		rechizite[0] = new Caiet("Matematici speciale in inginerie");
		rechizite[1] = new Manual("Sport");
		rechizite[2] = new Manual("Istorie");
		rechizite[3] = new Caiet("Info");
		rechizite[4] = new Manual("Comunism");
		rechizite[5] = new Caiet("Glume");
		
		Caiet caietMatematiciSpecialeInInginerie = new Caiet("Matematici speciale in inginerie");
		Manual manualSport = new Manual("Sport");
		Caiet caietInfo = new Caiet("Info");
		Caiet caietGlume = new Caiet("Glume");
		Manual manualComunism = new Manual("Comunism");
		Manual manualIstorie = new Manual("Istorie");
		Ghiozdan ghiozdan = new Ghiozdan();
		ghiozdan.addCaiet(caietMatematiciSpecialeInInginerie);
		ghiozdan.addManual(manualSport);
		ghiozdan.addCaiet(caietInfo);
		ghiozdan.addManual(manualIstorie);
		ghiozdan.addCaiet(caietGlume);
		ghiozdan.addManual(manualComunism);

		System.out.println("Numar rechizite: " + ghiozdan.getNrRechizite());
		System.out.println("Numar caiete: " + ghiozdan.getNrCaiete());
		System.out.println("Numar manuale: " + ghiozdan.getNrManuale());
		System.out.print("Rechizite: ");
		ghiozdan.listItems();
		System.out.println();
		System.out.print("Manuale: ");
		ghiozdan.listManual();
		System.out.println();
		System.out.print("Caiete: ");
		ghiozdan.listCaiet();
	}

}