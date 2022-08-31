package T23DesignPatterns.exercise.proxy;

public class Main {
    public static void main(String[] args) {
        Animal lion = new LionProxy();
        lion.speak();
    }
}
