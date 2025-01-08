import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Basic Calculator
        System.out.println("Enter two numbers for Basic Calculator:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        // Prompt for operation choice
        System.out.println("Choose an operation (+ or -):");
        char operation = scanner.next().charAt(0);

        BasicCalculator basicCalculator = new BasicCalculator();
        double result;
        switch (operation) {
            case '+':
                basicCalculator.add(num1);
                basicCalculator.add(num2);
                break;
            case '-':
                basicCalculator.add(num1);
                basicCalculator.subtract(num2);
                break;
            default:
                System.out.println("Invalid operation!");
                return; // Exit if invalid operation
        }
        System.out.println("Basic Calculator Result: " + basicCalculator.getResult());
        // Singleton Calculator
        System.out.println("Enter a number to add to Singleton Calculator:");
        double singletonNum = scanner.nextDouble();
        System.out.println("Choose an operation (+ or -):");
        char singletonOperation = scanner.next().charAt(0);

        CalculatorSingleton singletonCalculator = CalculatorSingleton.getInstance();
        switch (singletonOperation) {
            case '+':
                singletonCalculator.add(singletonNum);
                break;
            case '-':
                singletonCalculator.subtract(singletonNum);
                break;
            default:
                System.out.println("Invalid operation for Singleton Calculator!");
                break;
        }
        System.out.println("Singleton Calculator Result: " + singletonCalculator.getResult());
        // Factory Calculators
        // For Factory calculators, you can ask for additional inputs or demonstrate specific behaviors
        BasicCalculator factoryBasicCalculator = CalculatorFactory.createBasicCalculator();
        factoryBasicCalculator.add(10); // Example operation
        System.out.println("Factory Basic Calculator Result: " + factoryBasicCalculator.getResult());

        ScientificCalculator factoryScientificCalculator = CalculatorFactory.createScientificCalculator();
        // Perform operations specific to ScientificCalculator
        System.out.println("Factory Scientific Calculator Created.");

        scanner.close();
    }
}