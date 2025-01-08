public class CalculatorClient {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorInvoker invoker = new CalculatorInvoker();

        // Example: Adding 5
        Command addCommand = new AddCommand(calculator, 5);
        invoker.setCommand(addCommand);
        invoker.executeCommand();
    }
}