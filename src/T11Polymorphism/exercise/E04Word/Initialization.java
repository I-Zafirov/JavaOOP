package T11Polymorphism.exercise.E04Word;

public class Initialization {
    public static CommandInterface buildCommandInterface(StringBuilder text) {
        CommandImpl command = new CommandImpl(text);
        command.init();
        return command;
    }
}
