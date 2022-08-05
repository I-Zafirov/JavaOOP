package T13Solid.exercise.solid;

import T13Solid.exercise.solid.products.Chocolate;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        CalorieCalculator calorieCalculator = new CalorieCalculator();
        Printer printer = new Printer();

        final double sum = calorieCalculator.sum(new ArrayList<>() {{
            new Chocolate(0.5);
        }});

//printer.print(CalorieCalculator.SUM_FORMAT, sum);

        final double sum2 = calorieCalculator.sum(Collections.emptyList());
    }
}
