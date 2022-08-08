package T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.core.commands;

import T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.interfaces.Executable;

public abstract class Command implements Executable {

    private final String[] data;

    protected Command(String[] data) {
        this.data = data;
    }

    protected String[] getData() {
        return this.data;
    }

}

