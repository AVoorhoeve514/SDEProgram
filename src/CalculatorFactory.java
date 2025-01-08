public class CalculatorFactory {

    // Factory method to create a basic calculator
    public static BasicCalculator createBasicCalculator() {
        return new BasicCalculator();
    }

    // Factory method to create a scientific calculator
    public static ScientificCalculator createScientificCalculator() {
        return new ScientificCalculator();
    }
}