package T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies;

import T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.interfaces.UnitFactory;
import T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.core.CommandInterpreterImpl;
import T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.core.Engine;
import T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.core.factories.UnitFactoryImpl;
import T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.data.UnitRepository;
import T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.interfaces.Repository;

public class Main {
    public static void main(String[] args) {

        final Repository repository = new UnitRepository();

        final UnitFactory unitFactory = new UnitFactoryImpl();

        final CommandInterpreterImpl commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);

        final Engine engine = new Engine(commandInterpreter);

        engine.run();
    }
}
