package T23DesignPatterns.exercise.singleton.zooExample;

public class Owner {
    public void buyAnimal(String animalType, Integer count){
        Zoo.getInstance().getAnimals().put(animalType, count);
    }
}
