package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {
    public Animal getAnimal(String type) {
        if (Constants.Animals.Mammals.Cow.equals(type)) {
            return new Cow( 2, 0.1);
        } else if (Constants.Animals.Mammals.Monkey.equals(type)) {
            return new Monkey(2, 0.4);
        } else if (Constants.Animals.Mammals.Tiger.equals(type)) {
            return new Tiger(2, 0.9);
        } else {
            return null;
        }
    }
}