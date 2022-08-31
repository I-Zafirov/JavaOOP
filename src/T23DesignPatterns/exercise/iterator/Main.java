package T23DesignPatterns.exercise.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Zebra");
        animals.add("Octopus");

        Iterator<String> iterator = animals.iterator();
//        iterator.hasNext()
        iterator.next();
    }
}
