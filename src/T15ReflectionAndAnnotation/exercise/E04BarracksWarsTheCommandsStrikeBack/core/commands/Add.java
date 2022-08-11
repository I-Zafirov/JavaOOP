package T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.core.commands;

import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.annotations.Inject;
import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.interfaces.Unit;
import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.interfaces.Repository;
import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class Add extends Command {

    @Inject
    private Repository repository;

    @Inject
    private UnitFactory unitFactory;

    public Add(String[] data) {
        super(data);
    }

    @Override
    public String execute() throws ClassNotFoundException,
            NoSuchMethodException,
            InstantiationException,
            IllegalAccessException,
            InvocationTargetException,
            ExecutionControl.NotImplementedException {

        final String unitType = getData()[1];

        final Unit unitToAdd = this.unitFactory.createUnit(unitType);

        this.repository.addUnit(unitToAdd);

        return unitType + " added!";
    }
}
