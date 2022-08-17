package T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.interfaces;

public interface CommandInterpreter {

	@SuppressWarnings("unchecked")
    Executable interpretCommand(String[] data);

	Executable interpretCommand(String[] data, String commandName);
}
