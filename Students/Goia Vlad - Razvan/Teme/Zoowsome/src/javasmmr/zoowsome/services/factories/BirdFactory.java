package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Birds.Eagle.equals(type)) {
            return new Eagle(1, 0.2);
        } else if (Constants.Animals.Birds.Pigeon.equals(type)) {
            return new Pigeon(1, 0.0);
        } else if (Constants.Animals.Birds.Hawk.equals(type)) {
            return new Hawk(1, 0.3);
        } else {
            return null;
        }
    }
}