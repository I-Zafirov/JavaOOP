package T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.core.commands;

import T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.interfaces.Executable;

public abstract class Command implements Executable {

    private final String[] data;

    protected Command(String[] data) {
        this.data = data;
    }

    protected String[] getData() {
        return this.data;
    }

}

