package T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.interfaces;

import T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.core.commands.Command;

import java.lang.reflect.InvocationTargetException;

public interface CommandFactory {
    Command createCommand(String commandName, String[] data) throws ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException;
}
