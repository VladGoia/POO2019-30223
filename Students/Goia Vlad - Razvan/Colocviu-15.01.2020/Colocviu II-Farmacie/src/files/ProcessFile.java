package files;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Medicament;
import model.Pacient;;

public class ProcessFile{
	public static void main(String[] args) {
		try {
			
			int i = 0;
			int j = 0;
			Pacient[] p = new Pacient[10];
			Medicament[] m = new Medicament[10];
			
			File myObj1 = new File("detalii_pacienti.txt");
			Scanner myReader1 = new Scanner(myObj1);
			while (myReader1.hasNextLine()) {
				String data1 = myReader1.nextLine();
				p[i]  = new Pacient(data1);
				i++;
			}
			myReader1.close();
			File myObj2 = new File("detalii_farmacie.txt");
			Scanner myReader2 = new Scanner(myObj2);
			while (myReader2.hasNextLine()) {
				String data2 = myReader2.nextLine();
				m[j]  = new Medicament(data2);
				i++;
			}
			myReader2.close();
		}catch (FileNotFoundException e) {
			System.out.println("Error.");
			e.printStackTrace();
		} ;
	}
}