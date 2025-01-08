public class BasicCalculator implements ICalculator {
    private double result = 0;

    // Method to perform basic calculation (for example, addition)
    public void add(double operand) {
        result += operand;
    }

    // Method to perform subtraction
    public void subtract(double operand) {
        result -= operand;
    }

    @Override
    public void performCalculation() {
        // Here you might include some logic that uses the add or subtract methods.
        // This is just a placeholder for whatever calculation logic you need.
        System.out.println("Performing basic calculation.");
    }

    @Override
    public double getResult() {
        return result;
    }
}