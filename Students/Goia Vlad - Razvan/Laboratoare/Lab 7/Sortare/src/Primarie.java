import java.util.Arrays;

public class Primarie {
	public static void main(String argv[])
	{
		Persoana[] persoana=new Persoana[4];
		
		persoana[0]=new Persoana("Garbou","Raul",18);
		persoana[1]=new Persoana("Chiras","Fanica",20);
		persoana[2]=new Persoana("Gouaru","Radu",69);
		persoana[3]=new Persoana("Boia","Vlad",42915);
		
		Arrays.sort(persoana);
		for(int i=0; i<4; i++)
			System.out.print(persoana[i].toString()+"\n");
		
	}
}