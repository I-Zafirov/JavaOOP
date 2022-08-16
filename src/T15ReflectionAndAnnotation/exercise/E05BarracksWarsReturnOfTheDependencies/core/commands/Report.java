package T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.core.commands;

import T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.interfaces.Repository;
import T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.annotations.Inject;

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
