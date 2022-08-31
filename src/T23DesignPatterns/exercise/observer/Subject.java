package T23DesignPatterns.exercise.observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String newMagazineName);
}
