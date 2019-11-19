package javasmmr.zoowsome.controllers;
import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Insect;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Reptile;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.employees.Investors;
import javasmmr.zoowsome.models.employees.Manager;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {
	public static void printAnimals(Animal[] animals) {
    	System.out.println("Animale: ");
        for (int i = 0; i < animals.length; i++) {
        	if (animals[i].getTakenCareOf() == true) {
        		System.out.println( animals[i].getName() + " a fost ingrijit.");
        	} else {
        		System.out.println( animals[i].getName() + " nu a fost ingrijit.");
        	}
        }
        System.out.println();
    }

    public static void printEmployees(Employee[] employees) {
        System.out.println("Angajati: ");
        for (int i = 0; i < employees.length; i++) {
        	if (employees[i].getIsDead() == false) {
        		System.out.println(employees[i].getName() + ", ID: " + employees[i].getId() + ", salariu: " + employees[i].getSalary() + ", ore de lucru: " + ((Caretaker) employees[i]).getWorkingHours() + " si este viu.");
        	} else {
        		System.out.println(employees[i].getName() + ", ID: " + employees[i].getId() + ", salariu: " + employees[i].getSalary() + ", ore de lucru: " + ((Caretaker) employees[i]).getWorkingHours() + " si este decedat.");
        	}
        }
        System.out.println();
    }
	public static void main(String[] args) throws Exception
	{
		AnimalFactory abstractFactory = new AnimalFactory();
		EmployeeFactory employeeAbstractFactory = new EmployeeFactory();
		Mammal[] zooMammals = new Mammal[50];
		Bird[] zooBirds = new Bird[50];
		Aquatic[] zooAquatics = new Aquatic[50];
		Reptile[] zooReptiles = new Reptile[50];
		Insect[] zooInsects = new Insect[50];
		Animal[] animals = new Animal[5];
		Employee[] employees = new Caretaker[5];
		Employee[] sefu = new Manager[1];
		Employee[] banosu = new Investors[1];
		
		int mammalPopulation = 0;
		int birdPopulation = 0;
		int aquaticPopulation = 0;
		int reptilePopulation = 0;
		int insectPopulation = 0;

		SpeciesFactory speciesFactoryMammals = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactoryBirds = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactoryAquatics = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory speciesFactoryReptiles = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactoryInsects = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		
		int zooCount = 70;

		for (int i=0; i<zooCount; i++) {
			Random S = new Random();
			Random A = new Random();
			int sType = S.nextInt(5);
			int aType = A.nextInt(3);

			if (sType == 0) {
				if (aType == 0) {
					zooMammals[mammalPopulation] = (Mammal) speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Cow);
					mammalPopulation++;
				} 
				else if (aType == 1){
			        zooMammals[mammalPopulation] = (Mammal) speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Tiger);
			        mammalPopulation++;
				} 
				else if (aType == 2) {
					zooMammals[mammalPopulation] = (Mammal) speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Monkey);
					mammalPopulation++;
				}
			} 
			else if (sType == 1) {
				if (aType == 0) {
					zooBirds[birdPopulation] = (Bird) speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Pigeon);
					birdPopulation++;
				} 
				else if (aType == 1) {
					zooBirds[birdPopulation] = (Bird) speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Hawk);
					birdPopulation++;
				} 
				else if (aType == 2) {
					zooBirds[birdPopulation] = (Bird) speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Eagle);
					birdPopulation++;
				}
			} 
			else if (sType == 2) {
				if (aType == 0) {
					zooAquatics[aquaticPopulation] = (Aquatic) speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.Crab);
					aquaticPopulation++;
				} 
				else if (aType == 1){
					zooAquatics[aquaticPopulation] = (Aquatic) speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.Frog);
					aquaticPopulation++;
				} 
				else if (aType == 2) {
					zooAquatics[aquaticPopulation] = (Aquatic) speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.Shark);
					aquaticPopulation++;
				}
			} 
			else if (sType == 3) {
				if (aType == 0) {
					zooReptiles[reptilePopulation] = (Reptile) speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.Snake);
					reptilePopulation++;
				} 
				else if (aType == 1) {
					zooReptiles[reptilePopulation] = (Reptile) speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.Gecko);
					reptilePopulation++;
				} 
				else if (aType == 2) {
					zooReptiles[reptilePopulation] = (Reptile) speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.Crocodile);
					reptilePopulation++;
				}
			} 
			else if (sType == 4) {
				if (aType == 0) {
					zooInsects[insectPopulation] = (Insect) speciesFactoryInsects.getAnimal(Constants.Animals.Insects.Butterfly);
					insectPopulation++;
				} 
				else if (aType == 1) {
					zooInsects[insectPopulation] = (Insect) speciesFactoryInsects.getAnimal(Constants.Animals.Insects.Cockroach);
					insectPopulation++;
				} 
				else if (aType == 2) {
					zooInsects[insectPopulation] = (Insect) speciesFactoryInsects.getAnimal(Constants.Animals.Insects.Spider);
					insectPopulation++;
				}
			}
		}
		
		animals[0] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Cow);
		animals[1] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.Snake);
		animals[2] = speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.Shark);
		animals[3] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Eagle);        
		animals[4] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.Spider);
	
	    employees[0] = employeeAbstractFactory.getEmployee(Constants.Employees.Caretaker);
	    employees[0].setName("Gouaru Radu");
	    employees[0].setId();

	    employees[1] = employeeAbstractFactory.getEmployee(Constants.Employees.Caretaker);
	    employees[1].setName("Boia Vlad");
	    employees[1].setId();

	    employees[2] = employeeAbstractFactory.getEmployee(Constants.Employees.Caretaker);
	    employees[2].setName("Garbou Raul");
	    employees[2].setId();
	  
	    employees[3] = employeeAbstractFactory.getEmployee(Constants.Employees.Caretaker);
	    employees[3].setName("Vali Fanica");
	    employees[3].setId();
	    
	    employees[4] = employeeAbstractFactory.getEmployee(Constants.Employees.Caretaker);
	    employees[4].setName("Alin Fieraru");
	    employees[4].setId();
	    
	    sefu[0] = employeeAbstractFactory.getEmployee(Constants.Employees.Manager);
	    sefu[0].setName("Gavrea Sefu");
	    sefu[0].setId();
	    
	    banosu[0] = employeeAbstractFactory.getEmployee(Constants.Employees.Investor);
	    banosu[0].setName("Pop Vasile");
	    banosu[0].setId();

	    printEmployees(employees);
	    printAnimals(animals);
	        
		for (int i1 = 0; i1 < employees.length; i1++ ) {
	       	for (int j = 0; j < animals.length; j++) {
	       		if (employees[i1].getIsDead() == false && animals[j].getTakenCareOf() == false) {
	       			String result = ((Caretaker) employees[i1]).takeCareOf(animals[j]);
	       			if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
	       				employees[i1].setIsDead(true);
	       			} 
	       			else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
	       				j++;
	       			} 
	       			else {
	       				animals[j].setTakenCareOf(true);
	        		}
	        	}
	        }
	    }	
	    printEmployees(employees);
	}
}	
