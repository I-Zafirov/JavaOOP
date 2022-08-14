package T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.interfaces;

public interface CommandInterpreter {

	@SuppressWarnings("unchecked")
    Executable interpretCommand(String[] data);

	Executable interpretCommand(String[] data, String commandName);
}
