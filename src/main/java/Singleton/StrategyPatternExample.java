package Singleton;

public class StrategyPatternExample {
    public static void main(String[] args) {
        // Example usage of the Strategy pattern

        // Sorting algorithm
        AlgorithmStrategy sortingAlgorithm = new SortingAlgorithm();

        // Layout algorithm
        AlgorithmStrategy layoutAlgorithm = new LayoutAlgorithm();

        // Numeric validation algorithm
        AlgorithmStrategy numericValidation = new ValidationAlgorithm("Numeric");

        // Date validation algorithm
        AlgorithmStrategy dateValidation = new ValidationAlgorithm("Date");

        // Context to execute algorithms
        Context context = new Context();

        // Set and execute sorting algorithm
        context.setAlgorithm(sortingAlgorithm);
        context.executeAlgorithm();

        // Set and execute layout algorithm
        context.setAlgorithm(layoutAlgorithm);
        context.executeAlgorithm();

        // Set and execute numeric validation algorithm
        context.setAlgorithm(numericValidation);
        context.executeAlgorithm();

        // Set and execute date validation algorithm
        context.setAlgorithm(dateValidation);
        context.executeAlgorithm();
    }
}