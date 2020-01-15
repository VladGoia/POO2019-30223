package controller;

import model.*;
import model.Doctor.Reteta;

interface AtributiiAngajat {
	void adaugaMedicament(Medicament m, Farmacie f);
	void eliminaMedicament(Medicament m, Farmacie f);
	boolean verificareStoc(Medicament m, Farmacie f);
	boolean verificareMedicament(Medicament m);
	Reteta procesareReteta(Pacient p);
}

public class AngajatiController {
	
	public void adaugaMedicament(Medicament m, Farmacie f)
	{
		
	}
	
	public void eliminaMedicament(Medicament m, Farmacie f)
	{
		
	}
	
	public void verificareStoc(Medicament m, Farmacie f)
	{
		
	}
	
	public void verificareMedicament(Medicament m)
	{
		
	}
	
	public void sortAngajati(Angajat a[])
	{
		int n = a.length;
			for (int i = 0; i < n-1; i++)
				for (int j = 0; j < n-i-1; j++)
					if (a[j].getBonusSalariu() > a[j+1].getBonusSalariu())
					{
						Angajat temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
	}
}
