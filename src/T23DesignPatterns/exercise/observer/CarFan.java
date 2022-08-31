package T23DesignPatterns.exercise.observer;

public class CarFan implements Observer{
    @Override
    public void update(String magazineName) {
        System.out.println("Going to buy " + magazineName );
    }
}
