package T15ReflectionAndAnnotation.exercise.E05BarracksWarsReturnOfTheDependencies.interfaces;

import jdk.jshell.spi.ExecutionControl;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType) throws ExecutionControl.NotImplementedException;
}
