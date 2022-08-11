package T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory;

import T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.core.CommandInterpreterImpl;
import T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.interfaces.UnitFactory;
import T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.core.Engine;
import T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.core.factories.UnitFactoryImpl;
import T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.data.UnitRepository;
import T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.interfaces.Repository;

public class Main {
    public static void main(String[] args) {

        final Repository repository = new UnitRepository();

        final UnitFactory unitFactory = new UnitFactoryImpl();

        final CommandInterpreterImpl commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);

        final Engine engine = new Engine(commandInterpreter);

        engine.run();
    }
}
