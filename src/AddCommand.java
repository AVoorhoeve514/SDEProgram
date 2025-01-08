public class AddCommand implements Command {
    private Calculator calculator;
    private double operand;

    public AddCommand(Calculator calculator, double operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        calculator.add(operand);
    }
}