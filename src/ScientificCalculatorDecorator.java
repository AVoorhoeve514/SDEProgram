public class ScientificCalculatorDecorator extends CalculatorDecorator {
    public ScientificCalculatorDecorator(ICalculator decoratedCalculator) {
        super(decoratedCalculator);
    }

    @Override
    public void performCalculation() {
        super.performCalculation();
        // Additional scientific calculation logic...
        System.out.println("Performing scientific calculation.");
    }

    @Override
    public double getResult() {
        // Implement getResult to return the result from the decorated calculator
        return decoratedCalculator.getResult();
    }
}