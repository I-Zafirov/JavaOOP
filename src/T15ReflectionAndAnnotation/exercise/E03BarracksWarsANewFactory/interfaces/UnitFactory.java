package T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.interfaces;

import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public interface UnitFactory {

    Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException;
}