package T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.core.commands;

import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.annotations.Inject;
import T15ReflectionAndAnnotation.exercise.E04BarracksWarsTheCommandsStrikeBack.interfaces.Repository;

public class Report extends Command {

    @Inject
    private Repository repository;

    public Report(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return this.repository.getStatistics();
    }
}
