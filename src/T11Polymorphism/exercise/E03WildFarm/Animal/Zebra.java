package T11Polymorphism.exercise.E03WildFarm.Animal;

import T11Polymorphism.exercise.E03WildFarm.Food.Food;
import T11Polymorphism.exercise.E03WildFarm.Food.Meat;
import T11Polymorphism.exercise.E03WildFarm.Messages;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println(Messages.ZEBRA_SOUND);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException(String.format(Messages.WRONG_FOOD, getAnimalType() + "s"));
        }
        super.eat(food);
    }
}
