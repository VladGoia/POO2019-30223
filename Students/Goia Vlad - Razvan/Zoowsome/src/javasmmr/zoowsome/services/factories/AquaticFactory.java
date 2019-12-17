package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Aquatics.Shark.equals(type)) {
            return new Shark(5, 0.6);
        } else if (Constants.Animals.Aquatics.Frog.equals(type)) {
            return new Frog(1, 0.0);
        } else if (Constants.Animals.Aquatics.Crab.equals(type)) {
            return new Crab(1, 0.1);
        } else {
            return null;
        }
    }
} 