package T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.interfaces;

import T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.core.commands.Command;

import java.lang.reflect.InvocationTargetException;

public interface CommandFactory {
    Command createCommand(String commandName, String[] data) throws ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException;
}
