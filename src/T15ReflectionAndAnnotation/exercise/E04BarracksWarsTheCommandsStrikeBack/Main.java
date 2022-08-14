package T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack;

import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.core.CommandInterpreterImpl;
import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.data.UnitRepository;
import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.interfaces.UnitFactory;
import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.core.Engine;
import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.core.factories.UnitFactoryImpl;
import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.interfaces.Repository;

public class Main {
    public static void main(String[] args) {

        final Repository repository = new UnitRepository();

        final UnitFactory unitFactory = new UnitFactoryImpl();

        final CommandInterpreterImpl commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);

        final Engine engine = new Engine(commandInterpreter);

        engine.run();
    }
}
