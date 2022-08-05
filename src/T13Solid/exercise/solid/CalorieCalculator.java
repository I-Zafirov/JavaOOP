package T13Solid.exercise.solid;

import T13Solid.exercise.solid.products.Product;

import java.util.List;

public class CalorieCalculator {

    private final Printer printer;

    private static final String SUM_FORMAT = "Sum: %f";
    private static final String AVERAGE_FORMAT = "Average: %f";

    public CalorieCalculator() {
        this.printer = new Printer();
    }

    public double sum(List<Product> products) {
        final Double sum = products.stream()
                .mapToDouble(Product::getAmountOfCalories)
                .sum();

        print(SUM_FORMAT, sum);
        return sum;

//        for (Product product : products) {
//            if (product instanceof Coke) {
//                double grams = ((Coke) product).getMilliliters() * Coke.DENSITY;
//                sum += (Coke.CALORIES_PER_100_GRAMS / 100) * grams;
//            }
//
//            if (product instanceof Lemonade) {
//                double grams = ((Lemonade) product).getMilliliters() * Lemonade.DENSITY;
//                sum += (Lemonade.CALORIES_PER_100_GRAMS / 100) * grams;
//            }
//
//            if (product instanceof Chocolate) {
//                sum += (Chocolate.CALORIES_PER_100_GRAMS / 100) * ((Chocolate) product).getGrams();
//            }
//        }
//
//        print(SUM_FORMAT, sum);
//
//        return sum;
    }

    public double average(List<Product> products) {
        final double amount = sum(products) / products.size();
        print(AVERAGE_FORMAT, amount);
        return amount;
    }

    public void print(String format, double amount) {
        this.printer.print(format, amount);
    }
}
