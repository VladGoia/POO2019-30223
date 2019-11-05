package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Gecko;
import javasmmr.zoowsome.models.animals.Snake;

public class ReptileFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
            return new Crocodile();
        } else if (Constants.Animals.Reptiles.Gecko.equals(type)) {
            return new Gecko();
        } else if (Constants.Animals.Reptiles.Snake.equals(type)) {
            return new Snake();
        } else {
            return null;
        }
    }
} 