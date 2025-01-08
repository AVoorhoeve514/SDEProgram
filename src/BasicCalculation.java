public class BasicCalculation implements MathExpression {
    private double value;

    public BasicCalculation(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}