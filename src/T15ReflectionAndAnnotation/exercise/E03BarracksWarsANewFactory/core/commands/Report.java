package T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.core.commands;

import T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.annotations.Inject;
import T15ReflectionAndAnnotation.exercise.E03BarracksWarsANewFactory.interfaces.Repository;

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
