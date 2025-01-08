public abstract class CalculatorDecorator implements ICalculator {
    protected ICalculator decoratedCalculator;

    public CalculatorDecorator(ICalculator decoratedCalculator) {
        this.decoratedCalculator = decoratedCalculator;
    }

    @Override
    public void performCalculation() {
        decoratedCalculator.performCalculation();
    }
}