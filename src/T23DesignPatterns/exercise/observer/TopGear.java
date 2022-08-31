package T23DesignPatterns.exercise.observer;

import java.util.ArrayList;
import java.util.List;

public class TopGear implements Subject{
    List<Observer> observers;

    public TopGear() {
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String newMagazineName) {
        for (Observer observer : observers) {
            observer.update(newMagazineName);
        }
    }
}
