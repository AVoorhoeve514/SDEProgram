public class ScientificCalculator implements ICalculator {
    private double result = 0;

    // Additional scientific functions
    public double sin(double angle) {
        return Math.sin(angle);
    }

    public double cos(double angle) {
        return Math.cos(angle);
    }

    public double log(double value) {
        return Math.log(value);
    }

    @Override
    public void performCalculation() {
        // Here you might include some logic that uses the additional scientific functions.
        // This is just a placeholder for whatever calculation logic you need.
        System.out.println("Performing scientific calculation.");
    }

    @Override
    public double getResult() {
        return result;
    }
}