package T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.core.commands;

public class Fight extends Command {

    public Fight(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
