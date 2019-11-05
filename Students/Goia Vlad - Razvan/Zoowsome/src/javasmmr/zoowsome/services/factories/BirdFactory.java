package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Birds.Eagle.equals(type)) {
            return new Eagle();
        } else if (Constants.Animals.Birds.Pigeon.equals(type)) {
            return new Pigeon();
        } else if (Constants.Animals.Birds.Hawk.equals(type)) {
            return new Hawk();
        } else {
            return null;
        }
    }
}